package com.keepsimplefocus.coin.exchange.common.util

import java.io.FileInputStream
import java.util.Properties

/**
  * @author naruto.zwb
  * @version v0.1, 2018/02/15
  */
object PropertiesKeys {
  val CRYPTOPIA_CRAWLER_PUBLICAPI_INTERVAL = "cryptopia.crawler.publicapi.interval"
  val CRYPTOPIA_CRAWLER_PUBLICAPI_BASEDIR = "cryptopia.crawler.publicapi.basedir"
  val BASE_SYMBOL = "base.coin"
}

object PropertiesUtil {
  val prop = new Properties()
  prop.load(new FileInputStream("config.properties"))

  def get(key: String): String = {
    prop.getProperty(key)
  }
}
