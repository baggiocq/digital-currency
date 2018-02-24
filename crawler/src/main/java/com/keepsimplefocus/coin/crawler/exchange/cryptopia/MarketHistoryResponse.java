package com.keepsimplefocus.coin.crawler.exchange.cryptopia;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * @author naruto.zwb
 * @version v0.1, 2018/02/14
 */
@Getter
@Setter
public class MarketHistoryResponse extends CryptopiaBaseResponse {
    @Getter
    @Setter
    public static class MarketHistoryData {
        private String TradePairId;
        private String Label;
        private String Type;
        private double Price;
        private double Amount;
        private double Total;
        private long Timestamp;
    }
    private List<MarketHistoryData> Data;
}
