package projetolivro;
public class Livro implements Publicacao {
    private String titulo, autor; 
    private Pessoa leitor;
    private int totPaginas, pagAtual = 0;
    private boolean aberto = false;

    public String detalhes() {
        return "Livro{" + "\ntitulo=" + titulo + 
                "\n, autor=" + autor + 
                "\n, leitor=" + leitor.getNome() + 
                ", idade=" + leitor.getIdade() + 
                ", sexor=" + leitor.getSexo() + 
                "\n, totPaginas=" + totPaginas + 
                ", pagAtual=" + pagAtual + 
                ", aberto=" + aberto + '}';
    }
    
    public Livro(String titulo, String autor, Pessoa leitor, int totPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.leitor = leitor;
        this.totPaginas = totPaginas;
    }
     
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
    
    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if(p > this.totPaginas){
            System.out.println("Erro!! Número da página maior que o livro");
        }else if (this.aberto == false){
            System.out.println("Erro!! O livro está fechado!");
        }else{
        this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
