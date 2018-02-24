package com.keepsimplefocus.coin.trade;

import com.keepsimplefocus.coin.common.enums.TradeStatusEnum;

/**
 * @author naruto.zwb
 * @version v0.1, 2018/02/23
 */
public abstract class Trade {
    /**
     * @return 订单 id，失败为 null
     * */
    abstract public String buy(TradeInfo tradeInfo);

    /**
     * @return 订单 id，失败为 null
     * */
    abstract public String sell(TradeInfo tradeInfo);

    /**
     * 获取订单状态
     * */
    abstract public TradeStatusEnum getOrderStatus(String orderId);

    /**
     * 取消订单
     * */
    abstract public boolean cancelOrder(String orderId);
}
