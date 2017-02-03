package main;

public class ContaCorrente extends Conta {

    public void sacar(double valor) {
        super.sacar(valor);
        this.juros();
    }

    private void juros() {
        this.saldo -= 1;
    }
}
