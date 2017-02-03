package main;

import java.text.DecimalFormat;

public class Conta {

    protected double saldo;
    private int conta;

    DecimalFormat decimal = new DecimalFormat("####.00");

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void verSaldo() {
        System.out.println("Saldo: R$" + decimal.format(this.saldo));
    }
}
