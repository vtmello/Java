package main;
public class Main {
    public static void main(String[] args) {
        
        Carro c4 = new Carro();
        Carro ix35 = new Carro();
        
        c4.ligar();
        c4.trocarMarcha();
        c4.acelerar(25);
        c4.trocarMarcha();
        c4.acelerar(45);
        c4.trocarMarcha();
        c4.acelerar(60);
        System.out.println("=====================");
               
        
//        ix35.ligar();
//        ix35.desligar();
//        ix35.acelerar(100);

        ContaCorrente cc = new ContaCorrente();
        
        cc.depositar(100);
        cc.sacar(60);
        cc.verSaldo();
        System.out.println("=====================");
        ContaPoupanca cp = new ContaPoupanca();
        
        cp.depositar(100);
        cp.verSaldo();
        System.out.println("=====================");

        
    }
}
