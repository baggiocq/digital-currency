package com.keepsimplefocus.coin.exchange

import com.keepsimplefocus.coin.exchange.common.util.{PropertiesKeys, PropertiesUtil, TimeUtil}
import com.keepsimplefocus.coin.exchange.crawler.OKEXCrawler

/**
  * @author naruto.zwb
  * @version v0.1, 2018/02/22
  */
object CrawlerEntry {
  def main(args: Array[String]): Unit = {
    val baseDir = PropertiesUtil.get(PropertiesKeys.CRYPTOPIA_CRAWLER_PUBLICAPI_BASEDIR)

    val crawler = new OKEXCrawler
    while (true) {
      crawler.getAllCurrenciesSymbols().foreach { symbol =>
        val model = crawler.getCurrencyDetailModel(symbol, PropertiesUtil.get(PropertiesKeys.BASE_SYMBOL))
        crawler.writeToFile(baseDir + s"/${TimeUtil.getNowDate()}.dat", crawler.toJSONString(model) + "\n")
      }
    }
  }
}
