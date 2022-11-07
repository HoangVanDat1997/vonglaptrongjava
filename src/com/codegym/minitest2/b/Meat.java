package com.codegym.minitest2.b;

public class Meat extends Material{
    private double weight;

    public Meat(double weight) {
        this.weight = weight;
    }
    public double getAmount(){
        return weight * cost;
    }
}
