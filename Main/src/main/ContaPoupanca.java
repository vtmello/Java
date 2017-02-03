package main;
public class ContaPoupanca extends Conta{
        
    public void depositar(double valor) {
        super.depositar(valor);
        this.juros();
    }
    
        private void juros() {
        this.saldo += 1;
    }
}
