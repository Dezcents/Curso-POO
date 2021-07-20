package aula13;
public class Mamifero extends Animal{
    protected String corPelo;
    
    public String getCorPelo(){
        return corPelo;
    }
    
    public void setCorPelo(String cor){
        this.corPelo = cor;
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de mamífero");
    }
}
