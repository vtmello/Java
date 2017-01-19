package projetolivro;
public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Vinicius", 26, 'M');
        p[1] = new Pessoa("Ana", 61, 'F');
        
        l[0] = new Livro("A Casa do Terror", "Alvaro Cardoso Gomes", p[0], 102);
        l[1] = new Livro("A Rainha do Crime", "Agatha Christie", p[1], 237);
        l[2] = new Livro("A Garota Silenciosa", "Tess Gerritsen", p[1], 366);
        
        l[0].abrir();
        l[0].folhear(67);
        
        //l[1].abrir();
        //l[1].folhear(400);
        
        System.out.println(l[0].detalhes());
        //System.out.println(l[1].detalhes());
    }
    
}
