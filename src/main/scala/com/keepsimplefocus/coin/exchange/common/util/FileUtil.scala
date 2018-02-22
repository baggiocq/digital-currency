package com.keepsimplefocus.coin.exchange.common.util

import java.io.FileWriter

/**
  * @author naruto.zwb
  * @version v0.1, 
  */
object FileUtil {
  /**
    * not thread safe
    * */
  def appendToFile(filePath: String, text: String, separator: String = "\n"): Unit = {
    val file = new FileWriter(filePath, true)
    try {
      file.write(text + separator)
    } finally {
      if (file != null) {
        file.close()
      }
    }
  }
}
