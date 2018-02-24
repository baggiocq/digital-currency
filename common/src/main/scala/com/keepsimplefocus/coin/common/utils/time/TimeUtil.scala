package com.keepsimplefocus.coin.common.utils.time

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
