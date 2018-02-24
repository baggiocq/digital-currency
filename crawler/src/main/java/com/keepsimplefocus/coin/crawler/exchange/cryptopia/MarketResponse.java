package com.keepsimplefocus.coin.crawler.exchange.cryptopia;

/**
 * @author naruto.zwb
 * @version v0.1, 2018/02/14
 */
public class MarketResponse extends CryptopiaBaseResponse {
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

        public int getTradePairId() {
            return TradePairId;
        }

        public void setTradePairId(int tradePairId) {
            TradePairId = tradePairId;
        }

        public String getLabel() {
            return Label;
        }

        public void setLabel(String label) {
            Label = label;
        }

        public double getAskPrice() {
            return AskPrice;
        }

        public void setAskPrice(double askPrice) {
            AskPrice = askPrice;
        }

        public double getBidPrice() {
            return BidPrice;
        }

        public void setBidPrice(double bidPrice) {
            BidPrice = bidPrice;
        }

        public double getLow() {
            return Low;
        }

        public void setLow(double low) {
            Low = low;
        }

        public double getHigh() {
            return High;
        }

        public void setHigh(double high) {
            High = high;
        }

        public double getVolume() {
            return Volume;
        }

        public void setVolume(double volume) {
            Volume = volume;
        }

        public double getLastPrice() {
            return LastPrice;
        }

        public void setLastPrice(double lastPrice) {
            LastPrice = lastPrice;
        }

        public double getBuyVolume() {
            return BuyVolume;
        }

        public void setBuyVolume(double buyVolume) {
            BuyVolume = buyVolume;
        }

        public double getSellVolume() {
            return SellVolume;
        }

        public void setSellVolume(double sellVolume) {
            SellVolume = sellVolume;
        }

        public double getChange() {
            return Change;
        }

        public void setChange(double change) {
            Change = change;
        }

        public double getOpen() {
            return Open;
        }

        public void setOpen(double open) {
            Open = open;
        }

        public double getClose() {
            return Close;
        }

        public void setClose(double close) {
            Close = close;
        }

        public double getBaseVolume() {
            return BaseVolume;
        }

        public void setBaseVolume(double baseVolume) {
            BaseVolume = baseVolume;
        }

        public double getBaseBuyVolume() {
            return BaseBuyVolume;
        }

        public void setBaseBuyVolume(double baseBuyVolume) {
            BaseBuyVolume = baseBuyVolume;
        }

        public double getBaseSellVolume() {
            return BaseSellVolume;
        }

        public void setBaseSellVolume(double baseSellVolume) {
            BaseSellVolume = baseSellVolume;
        }
    }

    public MarketData getData() {
        return Data;
    }

    public void setData(MarketData data) {
        Data = data;
    }

    private MarketData Data;
}
