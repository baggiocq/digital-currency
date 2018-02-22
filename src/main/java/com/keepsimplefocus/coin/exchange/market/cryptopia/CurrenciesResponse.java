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
public class CurrenciesResponse extends CryptopiaBaseResponse {
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

        public int getId() {
            return Id;
        }

        public void setId(int id) {
            Id = id;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getSymbol() {
            return Symbol;
        }

        public void setSymbol(String symbol) {
            Symbol = symbol;
        }

        public String getAlgorithm() {
            return Algorithm;
        }

        public void setAlgorithm(String algorithm) {
            Algorithm = algorithm;
        }

        public double getWithdrawFee() {
            return WithdrawFee;
        }

        public void setWithdrawFee(double withdrawFee) {
            WithdrawFee = withdrawFee;
        }

        public double getMinWithdraw() {
            return MinWithdraw;
        }

        public void setMinWithdraw(double minWithdraw) {
            MinWithdraw = minWithdraw;
        }

        public double getMinBaseTrade() {
            return MinBaseTrade;
        }

        public void setMinBaseTrade(double minBaseTrade) {
            MinBaseTrade = minBaseTrade;
        }

        public boolean isTipEnabled() {
            return IsTipEnabled;
        }

        public void setTipEnabled(boolean tipEnabled) {
            IsTipEnabled = tipEnabled;
        }

        public double getMinTip() {
            return MinTip;
        }

        public void setMinTip(double minTip) {
            MinTip = minTip;
        }

        public int getDepositConfirmations() {
            return DepositConfirmations;
        }

        public void setDepositConfirmations(int depositConfirmations) {
            DepositConfirmations = depositConfirmations;
        }

        public String getStatus() {
            return Status;
        }

        public void setStatus(String status) {
            Status = status;
        }

        public String getStatusMessage() {
            return StatusMessage;
        }

        public void setStatusMessage(String statusMessage) {
            StatusMessage = statusMessage;
        }

        public String getListingStatus() {
            return ListingStatus;
        }

        public void setListingStatus(String listingStatus) {
            ListingStatus = listingStatus;
        }
    }

    public List<GetCurrenciesData> getData() {
        return Data;
    }

    public void setData(
        List<GetCurrenciesData> data) {
        Data = data;
    }

    private List<GetCurrenciesData> Data;
}
