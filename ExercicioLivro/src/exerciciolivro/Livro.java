package exerciciolivro;
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Métodos

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 1;
        this.aberto = false;
        this.leitor = leitor;
    }

    
    
   
    public void detalhes() {
        System.out.println("T�tulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Livro aberto: " + this.aberto);
        System.out.println("Total de p�ginas: " + getTotPaginas());
        System.out.println("P�ginas atual: " + getPagAtual());
        System.out.println("Leitor:" + this.leitor.getNome());
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

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        if (!this.aberto) {
            System.out.println("Abrindo livro...");
            this.aberto = true;
        } else {
            System.out.println("Livro já está aberto.");
        }
    }

    @Override
    public void fechar() {
        if (this.aberto) {
            System.out.println("Fechando livro...");
            this.aberto = false;
        } else {
            System.out.println("Livro já está fechado");
        }
    }
    
    @Override
    public void folhear(int pag) {
        if (pag <= this.totPaginas) {
        this.setPagAtual(pag);
    } else {
            setPagAtual(pag);
      }      
}

    @Override
    public void avancarPag() {
        if (this.getPagAtual() < this.getTotPaginas() && (this.getAberto())) {
            this.setPagAtual(this.getPagAtual() + 1) ;
            System.out.println("Página atual: " + this.getPagAtual());
        } else {
            System.out.println("Já está na última página ou o livro está fechado");
        }
    }

    @Override
    public void voltarPag() {
        if (this.getPagAtual() > 1 && (this.getAberto())) {
            this.setPagAtual(this.getPagAtual() - 1);
            System.out.println("Página atual: " + this.getPagAtual());
            
        } else {
            System.out.println("Já está na primeira página ou o livro está fechado");
        }
    }

}
