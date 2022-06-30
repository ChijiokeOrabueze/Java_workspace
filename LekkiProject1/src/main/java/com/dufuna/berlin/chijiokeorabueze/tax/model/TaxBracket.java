package com.dufuna.berlin.chijiokeorabueze.tax.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@ToString
public class TaxBracket {
    @Id
    @GeneratedValue
    private long id;
    private double bracket;
    private double taxAmount;
    private double rate;

    public TaxBracket(double bracket, double taxAmount, double rate) {
        this.bracket = bracket;
        this.taxAmount = taxAmount;
        this.rate = rate;
    }
}
