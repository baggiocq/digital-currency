package com.keepsimplefocus.coin.exchange.market.cryptopia;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author naruto.zwb
 * @version v0.1, 2018/02/14
 */
@Getter
@Setter
public class CurrenciesResponse extends CryptopiaBaseResponse {
    @Getter
    @Setter
    public static class GetCurrenciesData {
        private int Id;
        private String Name;
        private String Symbol;
        private String Algorithm;
        private double WithdrawFee;
        private double MinWithdraw;
        private double MinBaseTrade;
        private boolean IsTipEnabled;
        private double MinTip;
        private int DepositConfirmations;
        private String Status;
        private String StatusMessage;
        private String ListingStatus;
    }

    private List<GetCurrenciesData> Data;
}
