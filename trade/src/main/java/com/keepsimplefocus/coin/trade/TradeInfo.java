package com.keepsimplefocus.coin.trade;

import com.keepsimplefocus.coin.common.enums.TradeTypeEnum;

/**
 * @author naruto.zwb
 * @version v0.1, 2018/02/24
 */
public class TradeInfo {
    // 必填，用户申请的apiKey
    private String apiKey;
    // 必填，用 baseSymbol 来买
    private String baseSymbol;
    // 必填，来买 toBuySymbol
    private String toBuySymbol;
    // 必选
    private TradeTypeEnum tradeType;
    // 可选，下单价格 [限价买单(必填)： 大于等于0，小于等于1000000 | 市价买单(必填)： BTC :最少买入0.01个BTC 的金额(金额>0.01*卖一价) / LTC
    // :最少买入0.1个LTC 的金额(金额>0.1*卖一价)] / ETH :最少买入0.01个ETH 的金额(金额>0.01*卖一价)] 市价卖单不传price
    private double price;
    // 可选，交易数量 [限价卖单（必填）：BTC 数量大于等于0.01 / LTC 数量大于等于0.1 / ETH 数量大于等于0.01 | 市价卖单（必填）： BTC :
    // 最少卖出数量大于等于0.01 / LTC :最少卖出数量大于等于0.1 / ETH :最少卖出数量大于等于0.01] 市价买单不传amount
    private double amount;
    // 必选，请求参数的签名
    private String sign;
}
