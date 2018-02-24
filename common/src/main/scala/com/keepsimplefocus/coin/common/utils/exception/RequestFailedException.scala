package com.keepsimplefocus.coin.common.utils.exception

/**
  * @author naruto.zwb
  * @version v0.1, 
  */
class RequestFailedException(uri: String, httpCode: Int, exception: String) extends RuntimeException {
  override def toString: String = {
    s"com.keepsimplefocus.coin.common.utils.exception.RequestFailedException: $exception, httpCode is $httpCode, uri is $uri"
  }
}
