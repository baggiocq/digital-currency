package com.keepsimplefocus.coin.exchange.market.cryptopia

import com.alibaba.fastjson.JSON
import com.keepsimplefocus.coin.exchange.common.exception.RequestFailedException
import com.keepsimplefocus.coin.util.http.{HttpCodeEnum, RestfulClient}


/**
  * @author naruto.zwb
  * @version v0.1, 2018/02/14
  */
object CryptopiaPublicApi {
  private def getResponse[T](uri: String, responseClass: Class[T]): T = {
    val restClient = new RestfulClient()
    val response = restClient.get(uri)
    if (response.getHttpCode != HttpCodeEnum.HTTPCODE_200.getHttpCode) {
      throw new RequestFailedException(uri, response.getHttpCode, response.getBody)
    }
    JSON.parseObject(response.getBody, responseClass)
  }

  def getCurrencies(): CurrenciesResponse = {
    getResponse("https://www.cryptopia.co.nz/api/GetCurrencies", classOf[CurrenciesResponse])
  }

  def getTradePairs(): TradePairsResponse = {
    getResponse("https://www.cryptopia.co.nz/api/GetTradePairs", classOf[TradePairsResponse])
  }

  def getMarkets(suffix: String = ""): MarketsResponse = {
    getResponse("https://www.cryptopia.co.nz/api/GetMarkets" + suffix, classOf[MarketsResponse])
  }

  def getMarket(suffix: String = ""): MarketResponse = {
    getResponse("https://www.cryptopia.co.nz/api/GetMarket" + suffix, classOf[MarketResponse])
  }

  def getMarketOrders(suffix: String = ""): MarketOrdersResponse = {
    getResponse("https://www.cryptopia.co.nz/api/GetMarketOrders" + suffix, classOf[MarketOrdersResponse])
  }

  def getMarketOrderGroups(suffix: String = ""): MarketOrderGroupsResponse = {
    getResponse("https://www.cryptopia.co.nz/api/GetMarketOrderGroups" + suffix, classOf[MarketOrderGroupsResponse])
  }
}
