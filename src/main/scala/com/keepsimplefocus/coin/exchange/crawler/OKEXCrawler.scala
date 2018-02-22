package com.keepsimplefocus.coin.exchange.crawler

import com.alibaba.fastjson.JSON
import com.keepsimplefocus.coin.exchange.common.exception.RequestFailedException
import com.keepsimplefocus.coin.exchange.market.base.CurrencieyDetailModel
import com.keepsimplefocus.coin.exchange.market.okex.OKEXMarketModel
import com.keepsimplefocus.coin.util.http.{HttpCodeEnum, RestfulClient}

import scala.io.Source

/**
  * @author naruto.zwb
  * @version v0.1, 
  */
class OKEXCrawler extends Crawler {
  override def getAllCurrenciesSymbols(): Set[String] = {
    Source.fromFile("src/okex_allcoins.dat").getLines().toSet
  }

  override def getCurrencyDetailModel(symbol: String, baseSymbol: String = "BTC"): CurrencieyDetailModel = {
    val restClient = new RestfulClient()
    val uri = s"https://www.okex.com/api/v1/ticker.do?symbol=${symbol}_${baseSymbol}"
    val response = restClient.get(uri)
    if (response.getHttpCode != HttpCodeEnum.HTTPCODE_200.getHttpCode) {
      throw new RequestFailedException(uri, response.getHttpCode, response.getBody)
    }
    val okexModel = JSON.parseObject(response.getBody, classOf[OKEXMarketModel])
    if (okexModel.getDate > 0) {
      val detailModel = new CurrencieyDetailModel()
      detailModel.setTimeStamp(okexModel.getDate)

      val ticker = okexModel.getTicker
      detailModel.setCurrentPrice(ticker.getLast)
      detailModel.setBaseSymbol(baseSymbol)
      detailModel.setToBuySymbol(symbol)
      detailModel.setVolume(ticker.getVol)

      detailModel
    } else {
      null
    }
  }
}
