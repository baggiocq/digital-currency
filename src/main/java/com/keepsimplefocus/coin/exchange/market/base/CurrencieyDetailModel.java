package com.keepsimplefocus.coin.exchange.market.base;

/**
 * @author naruto.zwb
 * @version v0.1, 2018/02/17
 */
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

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getBaseSymbol() {
        return baseSymbol;
    }

    public void setBaseSymbol(String baseSymbol) {
        this.baseSymbol = baseSymbol;
    }

    public String getToBuySymbol() {
        return toBuySymbol;
    }

    public void setToBuySymbol(String toBuySymbol) {
        this.toBuySymbol = toBuySymbol;
    }

    public double getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(double openPrice) {
        this.openPrice = openPrice;
    }

    public double getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(double closePrice) {
        this.closePrice = closePrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getBuyVolume() {
        return buyVolume;
    }

    public void setBuyVolume(double buyVolume) {
        this.buyVolume = buyVolume;
    }

    public double getSellVolume() {
        return sellVolume;
    }

    public void setSellVolume(double sellVolume) {
        this.sellVolume = sellVolume;
    }
}
