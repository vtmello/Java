package ultimatefighting;
public class UltimateFighting {
    public static void main(String[] args) {
        Lutador l1 = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11 , 2 , 1);
        l1.apresentar();
        l1.status();
        
        Lutador l2[] = new Lutador[5]; 
        l2[0] = new Lutador("Putscript", "Brasil", 29, 1.68f, 80.9f, 14 , 2 , 3);
        l2[1] = new Lutador("Snapshadow", "EUA", 35, 1.65f,  80.9f, 12, 2, 1);
        l2[2] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        l2[3] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l2[4] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2 , 4);
        
        l2[0].apresentar();
        l2[0].ganharLuta();
        l2[0].status();
        
        l2[1].apresentar();
        l2[1].perderLuta();
        l2[1].status();
        
        l2[2].apresentar();
        l2[2].perderLuta();
        l2[2].status();
        
        l2[3].apresentar();
        l2[3].empatarLuta();
        l2[3].status();
        
        l2[4].apresentar();
        l2[4].ganharLuta();
        l2[4].status();
    }  
}
