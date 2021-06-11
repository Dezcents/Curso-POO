package aula04;
public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    public void Caneta(String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
        
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public String getCor (){
        return this.cor;
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    
    public boolean getTampada (){
        return this.tampada;
    }
    
    public void setTampada (boolean t){
        this.tampada = t;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public void Status(){
        System.out.println(" SOBRE A CANETA: ");
        
        System.out.println(" Modelo: " + this.getModelo());
        //System.out.println(" Modelo: " + this.modelo);
        
        System.out.println(" Ponta: " + this.getPonta());
        //System.out.println(" Ponta: " + this.ponta);
        
        System.out.println(" Cor: " + this.getCor());
        //System.out.println(" Cor: " + this.cor);
        
        System.out.println(" Tampada: " + this.getTampada() );
        //System.out.println(" Cor: " + this.tampada);
    }
}
