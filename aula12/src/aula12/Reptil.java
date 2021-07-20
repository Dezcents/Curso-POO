package aula12;
public class Reptil extends Animal {

    private String corEscama;
    
    public String getCorEscama(){
        return corEscama;
    }
    
    public void setCorEscama(String cor){
        this.corEscama = cor;
    }
    
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de réptil");
    }
    
}
