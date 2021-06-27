package aula09;
public class Livro  implements Publicacao{
    private String titulo,autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    public void Livro (String titulo, String autor, int totPaginas, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
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
    
    public void detalhes (){
        System.out.println(" ### DETALHES DO LIVRO ### ");
        System.out.println(" Título: " + this.getTitulo());
        System.out.println(" Autor: " + this.getAutor());
        System.out.println(" Total de Páginas: " + this.getTotPaginas());
        System.out.println(" Página atual: " + this.getPagAtual());
        System.out.println(" O livro está aberto: " + this.getAberto());
        System.out.println(" Quem está lendo o livro: " + this.leitor.getNome());
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
        this.pagAtual = p;
    }

    @Override
    public void avancarPag() {
        this.pagAtual = pagAtual + 1;
    }

    @Override
    public void voltarPag() {
        this.pagAtual = pagAtual - 1;
    }
}//fim da classe 
