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
public class MarketOrdersResponse extends CryptopiaBaseResponse {
    @Getter
    @Setter
    public static class MarketOrderData {
        private int TradePairId;
        private String Label;
        private double Price;
        private double Volume;
        private double Total;
    }

    @Getter
    @Setter
    public static class BuyAndSell {
        private List<MarketOrderData> Buy;
        private List<MarketOrderData> Sell;
    }

    private BuyAndSell Data;
    private String Error;
}
