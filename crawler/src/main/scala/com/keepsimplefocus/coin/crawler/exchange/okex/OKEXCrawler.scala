package com.keepsimplefocus.coin.crawler.exchange.okex

import com.alibaba.fastjson.JSON
import com.keepsimplefocus.coin.common.utils.exception.RequestFailedException
import com.keepsimplefocus.coin.common.utils.http.{HttpCodeEnum, RestfulClient}
import com.keepsimplefocus.coin.crawler.Crawler
import com.keepsimplefocus.coin.crawler.base.CurrencieyDetailModel

import scala.io.Source

/**
  * @author naruto.zwb
  * @version v0.1, 
  */
class OKEXCrawler extends Crawler {
  override def getAllCurrenciesSymbols(): Set[String] = {
    Source.fromFile("okex_allcoins.dat").getLines().toSet
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
