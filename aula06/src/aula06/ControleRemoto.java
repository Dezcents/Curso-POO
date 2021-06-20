package aula06;
public class ControleRemoto implements Controlador {
  private int volume;
  private boolean ligado;
  private boolean tocando;
  
   public  ControleRemoto (){
       this.setVolume(50);
       this.setLigado(false);
       this.setTocando(false);
   }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
         this.setLigado(true);
    }

    @Override
    public void desligar() {
         this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado() == true){
        System.out.println("---- MENU ----");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando: " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for( int i = 1; i <= this.getVolume(); i+=10){
           System.out.print("|");  
        }
        System.out.println(""); 
        } else {
            System.out.println("Impossível abrir Menu");
        }
        
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu..."); 
    }

    @Override
    public void maisVolume() {
         if(this.getLigado() == true){
           this.setVolume(this.getVolume() + 5);
       } else{
             System.out.println("Impossível aumentar o volume");
         } 
    }

    @Override
    public void menosVolume() {
          if(this.getLigado() == true){
           this.setVolume(this.getVolume() - 5);
       } else {
              System.out.println("Impossível diminuir o volume");
          }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() == true && this.getVolume() > 0){
            this.setVolume(0);
       }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() == true && this.getVolume() == 0){
            this.setVolume(50);
       } 
    }

    @Override
    public void play() {
        if(this.getLigado() == true && !(this.getTocando())){
            this.setTocando(true);
       } else{
            System.out.println("Não consegui reproduzir");
        } 
    }

    @Override
    public void pause() {
       if(this.getLigado() == true && this.getTocando()){
           this.setTocando(false);
       } else{
           System.out.println("Não consegui pausar");
       } 
    }
}
