package com.keepsimplefocus.coin.crawler

import java.io.FileWriter

import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.serializer.SerializerFeature
import com.keepsimplefocus.coin.crawler.base.CurrencieyDetailModel

/**
  * @author naruto.zwb
  * @version v0.1, 
  */
trait Crawler {
  def toJSONString(obj: Object): String = {
    JSON.toJSONString(obj, SerializerFeature.EMPTY: _*)
  }

  def getAllCurrenciesSymbols(): Set[String]

  def getCurrencyDetailModel(symbol: String, baseSymbol: String = "BTC"): CurrencieyDetailModel

  def writeToFile(filePath: String, text: String): Unit = {
    val file = new FileWriter(filePath, true)
    try {
      file.write(text)
    } finally {
      if (null != file) {
        file.close()
      }
    }
  }
}
