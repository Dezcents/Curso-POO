package atividadeaula02;

public class VideoGame {
    String marca;
    String dono;
    double preco;
    int numeroSerie;
    boolean ligar;
    
    void status (){
        System.out.println("Marca: " + this.marca);
        System.out.println("Dono: " + this.dono);
        System.out.println("Preço: " + this.preco);
        System.out.println("Número de Série: " + this.numeroSerie);
        System.out.println("O vídeo game está ligado? : " + this.ligar);
    }
    
    void funcionando (){
        if (this.ligar == true){
            System.out.println("Está ligado, posso jogar! ");
        }else {
            System.out.println("ERRO! Está desligado e não posso jogar! ");
        }
    }
    
    void ligando(){
        this.ligar = true;
        System.out.println("Estou ligando o video game!");
    }
    
    void desligando(){
        this.ligar = false;
        System.out.println("O vídeo game está desligado!");
    }
    
}
