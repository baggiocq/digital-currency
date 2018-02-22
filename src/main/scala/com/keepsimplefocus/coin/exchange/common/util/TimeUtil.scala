package com.keepsimplefocus.coin.exchange.common.util

import java.text.SimpleDateFormat
import java.util.Date

/**
  * @author naruto.zwb
  * @version v0.1, 
  */
object TimeUtil {
  def getNowDate(): String = {
    new SimpleDateFormat("yyyy-MM-dd").format(new Date)
  }
}
