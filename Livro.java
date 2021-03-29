package exercicio;

public class Livro implements Publicação {

    private String titulo, autor;
    private int totPag, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public void detalhes() {

        System.out.println("\n-------------------");
        System.out.println(this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println(this.getTotPag() + " páginas");
        System.out.println("Página atual: " + this.getPagAtual());
        System.out.println("Leitor: " + this.leitor.getNome());
        System.out.println("-------------------\n");
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

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
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

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {

        if (!this.isAberto()) {
            this.setAberto(true);
            System.out.println("Abrindo livro...");
        } else {
            System.out.println("O livro já está aberto.");
        }
    }

    @Override
    public void fechar() {
        if (this.isAberto()) {
            this.setAberto(false);
            System.out.println("Fechando livro...");
        } else {
            System.out.println("O livro já está fechado.");
        }
    }

    @Override
    public void folhear(int p) {
        this.setPagAtual(p);
        System.out.println("Folheando...");
    }

    @Override
    public void avançarPag() {
        if (this.isAberto()) {
            this.setPagAtual(this.getPagAtual() + 1);
            System.out.println("Próxima página.");
        } else {
            System.out.println("O livro está fechado.");
        }
    }

    @Override
    public void voltarPag() {
        if (this.isAberto()) {
            this.setPagAtual(this.getPagAtual() - 1);
            System.out.println("Página anterior.");
        } else {
            System.out.println("O livro está fechado.");
        }
    }

}
