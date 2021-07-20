package aula12;
public class Peixe extends Animal{
    private String corEscama ;
    
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }
    
    public String getCorEscama(){
        return corEscama;
    }
    
    public void setCorEscama(String cor){
        this.corEscama = cor;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo algas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    
    
    
}
