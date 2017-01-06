package controle;
public class Controle {
    public static void main(String[] args) {
      ControleRemoto c1 = new ControleRemoto();
      c1.ligar();
      c1.maisVolume();
      c1.play();
      //c1.ligarMudo();
      c1.abrirMenu();
      c1.fecharMenu();
      
      ControleRemoto c2 = new ControleRemoto();
      c2.abrirMenu();
      c2.maisVolume();
      c2.play();
      c2.ligarMudo();
    }
    
}
