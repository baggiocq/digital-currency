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
public class TradePairsResponse extends CryptopiaBaseResponse {
    @Getter
    @Setter
    public static class TradePairsData {
        private int Id;
        private String Label;
        private String Currency;
        private String Symbol;
        private String BaseCurrency;
        private String BaseSymbol;
        private String Status;
        private String StatusMessage;
        private double TradeFee;
        private double MinimumTrade;
        private double MaximumTrade;
        private double MinimumBaseTrade;
        private double MaximumBaseTrade;
        private double MinimumPrice;
        private double MaximumPrice;
    }

    private List<TradePairsData> Data;
}
