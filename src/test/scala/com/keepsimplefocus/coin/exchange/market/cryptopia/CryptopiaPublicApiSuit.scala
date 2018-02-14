package com.keepsimplefocus.coin.exchange.market.cryptopia

import org.scalatest.FunSuite


/**
  * @author naruto.zwb
  * @version v0.1, 2018/02/14
  */
class CryptopiaPublicApiSuit extends FunSuite{
  test("getCurrencies") {
    val ret = CryptopiaPublicApi.getCurrencies()
    assert(ret != null)
    assert(ret.isSuccess == true)
  }

  test("getTradePairs") {
    val ret = CryptopiaPublicApi.getTradePairs()
    assert(ret != null)
    assert(ret.isSuccess == true)
  }

  test("getMarkets") {
    val ret = CryptopiaPublicApi.getMarkets()
    assert(ret != null)
    assert(ret.isSuccess == true)
  }

  test("getMarket") {
    val ret = CryptopiaPublicApi.getMarket("/100")
    assert(ret != null)
    assert(ret.isSuccess == true)
  }

  test("getMarketOrders") {
    val ret = CryptopiaPublicApi.getMarketOrders("/100")
    assert(ret != null)
    assert(ret.isSuccess == true)
  }

  test("getMarketOrderGroups") {
    val ret = CryptopiaPublicApi.getMarketOrderGroups()
    assert(ret != null)
    assert(ret.isSuccess == true)
  }
}