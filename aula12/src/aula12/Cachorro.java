package aula12;
public class Cachorro extends Mamifero {
    
    private void abanarRabo(){
        System.out.println("Abanando o rabo");
    }
    
    private void enterraOsso(){
        System.out.println("Enterrando osso");
    }
    
    @Override 
    public void emitirSom(){
        System.out.println("Latindo");
    }
}
