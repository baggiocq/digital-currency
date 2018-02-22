package com.keepsimplefocus.coin.exchange.market.base;

import lombok.Getter;
import lombok.Setter;

/**
 * @author naruto.zwb
 * @version v0.1, 2018/02/17
 */
@Getter
@Setter
public class CurrencieyDetailModel {
    // 时间戳，单位为秒
    private long timeStamp;
    // 使用 baseSymbol 去买 toBuySymbol
    private String baseSymbol;
    private String toBuySymbol;
    private double openPrice;
    private double closePrice;
    private double currentPrice;
    // 涨跌，可能是正数或负数，如涨 5.66% 即为 5.66
    private double change;
    private double volume;
    private double buyVolume;
    private double sellVolume;
}
