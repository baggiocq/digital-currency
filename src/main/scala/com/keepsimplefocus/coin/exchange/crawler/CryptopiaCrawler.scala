package com.keepsimplefocus.coin.exchange.crawler

import scala.collection.mutable
import collection.JavaConversions._

import com.keepsimplefocus.coin.exchange.common.util.{PropertiesKeys, PropertiesUtil, TimeUtil}
import com.keepsimplefocus.coin.exchange.market.base.CurrencieyDetailModel
import com.keepsimplefocus.coin.exchange.market.cryptopia.CryptopiaPublicApi
import org.apache.commons.lang3.StringUtils
import org.slf4j.LoggerFactory

import scala.io.Source

/**
  * @author naruto.zwb
  * @version v0.1, 
  */
class CryptopiaCrawler extends Crawler{
  private val logger = LoggerFactory.getLogger("CryptopiaCrawler")

  override def getAllCurrenciesSymbols(): Set[String] = {
    val symbols = mutable.Set[String]()
    CryptopiaPublicApi.getCurrencies().getData().foreach { currency =>
      if (!StringUtils.isEmpty(currency.getSymbol)) {
        symbols.add(currency.getSymbol)
      }
    }

    // 与白名单做交集
    val whiteList = Source.fromFile("whitelist.dat").getLines().toSet

    symbols.toSet & whiteList
  }

  override def getCurrencyDetailModel(symbol: String, baseSymbol: String = "BTC") = {
    var model: CurrencieyDetailModel = null
    val marketResponse = CryptopiaPublicApi.getMarket(s"/${symbol}_${baseSymbol}")
    if (marketResponse != null) {
      model = new CurrencieyDetailModel()
      val data = marketResponse.getData()
      model.setTimeStamp(System.currentTimeMillis() / 1000)
      model.setBaseSymbol(symbol)
      model.setToBuySymbol(baseSymbol)
      model.setOpenPrice(data.getOpen)
      model.setClosePrice(data.getClose)
      model.setCurrentPrice(data.getLastPrice)
      model.setChange(data.getChange)
      model.setVolume(data.getVolume)
    }
    model
  }

  private def publicApiCrawl(baseDir: String): Unit = {
    var model: CurrencieyDetailModel = null
    while (true) {
      getAllCurrenciesSymbols().foreach { item =>
        logger.info(s"get detail model of ${item}")
        try {
          model = getCurrencyDetailModel(item)
          if (null != model) {
            writeToFile(baseDir + s"/${TimeUtil.getNowDate()}.dat", toJSONString(model) + "\n")
          }
        } catch {
          case e: Exception => logger.error(e.toString + s"get $item detail model failed")
        }
      }

      // Thread.sleep(PropertiesUtil.get(PropertiesKeys.CRYPTOPIA_CRAWLER_PUBLICAPI_INTERVAL).toInt)
    }
  }
}
