package com.keepsimplefocus.coin.crawler.exchange.cryptopia;

import java.util.List;

import com.keepsimplefocus.coin.crawler.exchange.cryptopia.MarketOrdersResponse.MarketOrderData;
import lombok.Getter;
import lombok.Setter;

/**
 * @author naruto.zwb
 * @version v0.1, 2018/02/14
 */
@Getter
@Setter
public class MarketOrderGroupsResponse extends CryptopiaBaseResponse {
    @Getter
    @Setter
    public static class MarketOrderGroups {
        private int TradePairId;
        private String Market;
        private List<MarketOrderData> Buy;
        private List<MarketOrderData> Sell;
    }

    private List<MarketOrderGroups> Data;
}
