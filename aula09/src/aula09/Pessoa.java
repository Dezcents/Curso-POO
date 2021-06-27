package aula09;
public class Pessoa {
    private String nome,sexo;
    private int idade;
    
    //Métodos Especiais 
    public void Pessoa (String nome, String sexo, int idade){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
    
    public String getNome (){
        return nome;
    }
    
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public String getSexo (){
        return sexo;
    }
    
    public void setSexo (String sexo){
        this.sexo = sexo;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void fazerAniver(){
        this.idade = idade +1;
        //this.setIdade(this.getIdade() + 1);
    }
    
    public void status(){
        if(this.getSexo().equals("F")){
            System.out.println(this.getNome() + " é do sexo feminino e tem "
             + this.getIdade() + " anos");
        } else if (this.getSexo().equals("M")){
            System.out.println(this.getNome() + " é do sexo masculino e tem "
            + this.getIdade() + " anos");
        }else {
            System.out.println("Digite um sexo válido");
        }
    }
    
}//fim da classe
