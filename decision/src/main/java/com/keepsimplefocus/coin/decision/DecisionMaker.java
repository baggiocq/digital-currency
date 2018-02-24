package com.keepsimplefocus.coin.decision;

import java.util.List;

import com.keepsimplefocus.coin.trade.TradeInfo;

/**
 * @author naruto.zwb
 * @version v0.1, 2018/02/24
 */
public abstract class DecisionMaker {
    abstract public List<TradeInfo> getDecision();
}
