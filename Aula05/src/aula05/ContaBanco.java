package aula05;
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
     public void estadoAtual(){
         System.out.println("-----------------------------");
         System.out.println("Conta: " + this.getNumConta());
         System.out.println("Tipo: " + this.getTipo());
         System.out.println("Dono: " + this.getDono());
         System.out.println("Saldo: " + this.getSaldo());
         System.out.println("Status: " + this.getStatus());
    }
    
    public void ContaBanco(){
        this.setStatus(false);
        this.setSaldo(0);
    }
    
    public int getNumConta (){
        return this.numConta;
    }
    
    public void setNumConta(int n){
        this.numConta = n;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String t){
        this.tipo = t;
    }
    
    public String getDono(){
        return this.dono;
    }
    
    public void setDono (String d){
        this.dono = d;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo (float s){
        this.saldo = s;
    }
    
    public boolean getStatus (){
        return this.status;
    }
    
    public void setStatus (boolean status){
        this.status = status;
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t == "CC"){
            this.setSaldo(50f);
            //this.setTipo("CC");
        }else if(t == "CP") {
            this.setSaldo(150f);
            //this.setTipo("CP");
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        }else if(this.getSaldo() < 0){
            System.out.println("Conta em débito");
        }else{
            System.out.println("Conta fechada com sucesso!");
            this.setStatus(false);
    }
    }
    
    public void depositar (float v){
        if (this.getStatus() == true){
            this.setSaldo(this.getSaldo() + v);
            //this.saldo = this.saldo + v;
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }else {
            System.out.println("Impossível depositar em uma conta fechada");
        }
    }
    
    public void sacar(float v){
        if(this.getStatus() == true){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
    
public void pagarMensal(){
    int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if(this.getTipo() == "CP") {
            v = 20;
        }
        if(this.getStatus() == true){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
    }else {
            System.out.println("Impossível pagar uma conta fechada");         
        }
    }
}
    

   
