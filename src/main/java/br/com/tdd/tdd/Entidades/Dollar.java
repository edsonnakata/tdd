package br.com.tdd.tdd.Entidades;

public class Dollar {
    public int amount;

    public Dollar(int amount){
        this.amount = amount;
    }

    public int times(int multiplier){
        return this.amount * multiplier;
    }
}
