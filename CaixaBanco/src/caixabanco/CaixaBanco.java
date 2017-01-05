package caixabanco;
public class CaixaBanco {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1234);
        p1.setDono("Ana");
        p1.abrirConta("CC");
        p1.estadoAtual();
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(5678);
        p2.setDono("Vinícius");
        p2.abrirConta("CP");
        p2.estadoAtual();
        
        p1.depositar(300);
        p2.depositar(500);
        
        p1.estadoAtual();
        p2.estadoAtual();
        
        p1.sacar(100);
        p2.sacar(150);
        
        p1.estadoAtual();
        p2.estadoAtual();
        
        p1.fecharConta();
    }
    
}
