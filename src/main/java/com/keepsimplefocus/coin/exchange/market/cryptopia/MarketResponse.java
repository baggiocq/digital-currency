package com.keepsimplefocus.coin.exchange.market.cryptopia;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * @author naruto.zwb
 * @version v0.1, 2018/02/14
 */
@Getter
@Setter
public class MarketResponse extends CryptopiaBaseResponse {
    @Getter
    @Setter
    public static class MarketData {
        private int TradePairId;
        private String Label;
        private double AskPrice;
        private double BidPrice;
        private double Low;
        private double High;
        private double Volume;
        private double LastPrice;
        private double BuyVolume;
        private double SellVolume;
        private double Change;
        private double Open;
        private double Close;
        private double BaseVolume;
        private double BaseBuyVolume;
        private double BaseSellVolume;
    }

    private MarketData Data;
}
