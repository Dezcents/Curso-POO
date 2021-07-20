package aula14;
public class Video implements AçoesVideo {
    private String titulo;
    private int avaliacao,views,curtidas;
    private boolean repoduzindo;

    public void Video(String titulo){
        this.titulo = titulo;
        this.avaliacao = 0;
        this.curtidas = 0;
        this.views = 0;
        this.repoduzindo = false;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int)((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    private void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getRepoduzindo() {
        return repoduzindo;
    }

    private void setRepoduzindo(boolean repoduzindo) {
        this.repoduzindo = repoduzindo;
    }

    @Override
    public void play() {
        this.repoduzindo = true;
    }

    @Override
    public void pause() {
        this.repoduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas ++;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + 
                ", views=" + views + ", curtidas=" + curtidas + 
                ", repoduzindo=" + repoduzindo + '}';
    }
    
    
}
