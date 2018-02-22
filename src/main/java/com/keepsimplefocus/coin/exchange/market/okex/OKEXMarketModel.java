package com.keepsimplefocus.coin.exchange.market.okex;

import lombok.Getter;
import lombok.Setter;

/**
 * @author naruto.zwb
 * @version v0.1, 2018/02/22
 */
@Getter
@Setter
public class OKEXMarketModel {
    @Getter
    @Setter
    public static class Ticker {
        private double high;
        private double vol;
        private double last;
        private double low;
        private double buy;
        private double sell;
    }
    private long date;
    private Ticker ticker;
}
