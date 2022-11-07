package com.codegym.minitest2.b;

import java.time.LocalDate;

public class CrispyFlour extends Material{
    private double quantity;

    public CrispyFlour(double quantity) {
        this.quantity = quantity;
    }

    public double getAmount(){
        return quantity * cost;
    }
    public LocalDate LocalDate(){
        return manufacturingDate;

    }

}
