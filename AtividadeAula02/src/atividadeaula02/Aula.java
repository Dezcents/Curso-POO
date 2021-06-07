package atividadeaula02;

public class Aula {
    String aluno;
    String data;
    String professor;
    //float duracao; DECIDIR QUAL TIPO DE VARIÁVEL E ACRESCENTAR AO MÉTODO 
    //DURAÇÃO
    String inicio;
    String termino;
    
    void status (){
        System.out.println("Data: " + this.data);
        System.out.println("Professor: " + this.professor);
        System.out.println("Aluno: " + this.aluno);
        System.out.println("Inicio: " + this.inicio);
        System.out.println("Término: " + this.termino);
        //System.out.println("Duração: ");//
    }
    
    void comecarAula(){
        System.out.println("A aula começou às " + this.inicio);
    }
    
    void terminarAula (){
        System.out.println("A aula terminou às: " + this.termino);
    }
    
    void cancelarAula (){
        System.out.println("A aula foi cancelada pelo professor " + this.professor);
    }
    
    void fazerExercicio(){
        System.out.println("O aluno " + this.aluno + " está fazendo os exercícios passados pelo professor " + this.professor);
        
    }
    
    
}
