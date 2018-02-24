package com.keepsimplefocus.coin.common.enums;

/**
 * @author naruto.zwb
 * @version v0.1, 2018/02/23
 */
public enum TradeStatusEnum {
    // 已撤销
    REVOKED,
    // 未成交
    UNTRADED,
    // 部分成交
    PART_TRADED,
    // 完全成交
    COMPLETELY_TRADED,
    // 撤单处理中
    REVOKING
}