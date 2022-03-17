package com.mindhub.homebanking.models;


import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
public class ClientInvest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator= "native")
    @GenericGenerator(name="native", strategy = "native")
    private Long id;

    private double amount;
    private int plazo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "invest_id")
    private Invest invest;

    public ClientInvest() {
    }

    public ClientInvest(Client client, Invest invest) {
        this.client = client;
        this.invest = invest;
    }

    public ClientInvest(double amount, int plazo, Client client, Invest invest) {
        this.amount = amount;
        this.plazo = plazo;
        this.client = client;
        this.invest = invest;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Invest getInvest() {
        return invest;
    }

    public void setInvest(Invest invest) {
        this.invest = invest;
    }
}
