package com.keepsimplefocus.coin.exchange.market.cryptopia;

import java.util.List;

import com.keepsimplefocus.coin.exchange.market.cryptopia.MarketResponse.MarketData;
import lombok.Getter;
import lombok.Setter;

/**
 * @author naruto.zwb
 * @version v0.1, 2018/02/14
 */
@Getter
@Setter
public class MarketsResponse extends CryptopiaBaseResponse {
    private List<MarketData> Data;
}
