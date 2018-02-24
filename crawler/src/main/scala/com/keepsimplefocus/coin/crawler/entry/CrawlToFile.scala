package com.keepsimplefocus.coin.crawler.entry

import com.keepsimplefocus.coin.common.utils.time.TimeUtil
import com.keepsimplefocus.coin.common.utils.{PropertiesKeys, PropertiesUtil}
import com.keepsimplefocus.coin.crawler.exchange.okex.OKEXCrawler
import org.slf4j.LoggerFactory

/**
  * @author naruto.zwb
  * @version v0.1, 2018/02/22
  */
object CrawlToFile {
  private val logger = LoggerFactory.getLogger("CrawlerEntry")

  def main(args: Array[String]): Unit = {
    val baseDir = PropertiesUtil.get(PropertiesKeys.CRYPTOPIA_CRAWLER_PUBLICAPI_BASEDIR)

    val crawler = new OKEXCrawler
    while (true) {
      try {
        val allSymbols = crawler.getAllCurrenciesSymbols()
        allSymbols.foreach { symbol =>
          try {
            val model = crawler.getCurrencyDetailModel(symbol, PropertiesUtil.get(PropertiesKeys.BASE_SYMBOL))
            if (model == null) {
              logger.error(s"got $symbol info is null")
            } else {
              crawler.writeToFile(baseDir + s"/${TimeUtil.getNowDate()}.dat", crawler.toJSONString(model) + "\n")
            }
          } catch {
            case e: Exception => logger.error(e.toString)
          }
        }
      } catch {
        case e: Exception => logger.error(e.toString)
      }

      Thread.sleep(PropertiesUtil.get(PropertiesKeys.CRYPTOPIA_CRAWLER_PUBLICAPI_INTERVAL).toLong)
    }
  }
}
