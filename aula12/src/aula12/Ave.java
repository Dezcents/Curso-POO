package aula12;
public class Ave extends Animal {
    private String corPena;
    
    public void fazerninho(){
        System.out.println("Construi um ninho");
    }
    
    public String getCorPena(){
        return corPena;
    }
    
    public void setCorPena(String cor){
        this.corPena = cor;
    }
    
    @Override
    public void locomover(){
        System.out.println("Voando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo frutas");
    }
    
    @Override 
    public void emitirSom(){
        System.out.println("Som de ave");
    }
}
