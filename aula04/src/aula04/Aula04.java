package aula04;
public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.Caneta("BIC", "Amarela", 0.4f);
        c1.Status();
        //System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
        
        Caneta c2 = new Caneta();
        c2.Caneta("Faber Castell", "Vermelha", 1.5f);
        c2.Status();
        
        //c1.setModelo("BIC");
        //c1.modelo = "BIC";
        
        //c1.setPonta(0.5f);
        //c1.ponta = 0.5f;
        
        //c1.setCor("Azul");
        //c1.cor = "Azul"
        
        //c1.setTampada(true);
        //c1.tampada = true;
        
        
        
        
    }
    
}
