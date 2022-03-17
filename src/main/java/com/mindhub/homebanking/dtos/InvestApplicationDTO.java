package com.mindhub.homebanking.dtos;



public class InvestApplicationDTO {

    private Long investId;
    private double amount;
    private int plazo;
    private String fromAccountNumber;

    public InvestApplicationDTO() {
    }

    public InvestApplicationDTO(Long investId, double amount, int plazo, String fromAccountNumber) {
        this.investId = investId;
        this.amount = amount;
        this.plazo = plazo;
        this.fromAccountNumber = fromAccountNumber;
    }

    public Long getInvestId() {
        return investId;
    }

    public void setInvestId(Long investId) {
        this.investId = investId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public String getFromAccountNumber() {
        return fromAccountNumber;
    }

    public void setFromAccountNumber(String fromAccountNumber) {
        this.fromAccountNumber = fromAccountNumber;
    }
}
