package com.jsonParse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Currency {
    @JsonProperty("ccy")
    private String ccy;

    @JsonProperty("base_ccy")
    private String base_ccy;

    @JsonProperty("buy")
    private double buy;

    @JsonProperty("sale")
    private double sale;

    public Currency() {
    }

    public Currency(String ccy, String base_ccy, double buy, double sale) {
        this.ccy = ccy;
        this.base_ccy = base_ccy;
        this.buy = buy;
        this.sale = sale;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public String getBase_ccy() {
        return base_ccy;
    }

    public void setBase_ccy(String base_ccy) {
        this.base_ccy = base_ccy;
    }

    public double getBuy() {
        return buy;
    }

    public void setBuy(double buy) {
        this.buy = buy;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    @Override
    public String toString() {
        return "CurrencyRate{" +
                " ccy = '" + ccy + '\'' +
                ", base_ccy = '" + base_ccy + '\'' +
                ", buy = " + buy +
                ", sale = " + sale +
                '}';
    }
}
