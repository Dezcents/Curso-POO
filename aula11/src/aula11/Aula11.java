package aula11;
public class Aula11 {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante ();
        v1.setNome("Juca");
        v1.setIdade(24);
        v1.setSexo("M");
        System.out.println( v1.toString());
                
        Aluno a1 = new Aluno();
        a1.setNome("Lucas");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(2222);
        b1.setNome("Carina");
        b1.setSexo("F");
        b1.setIdade(23);
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
        System.out.println(b1.toString());
        
        Professor p1 = new Professor ();
        p1.setNome("Adriana");
        p1.setSexo("F");
        p1.setIdade(35);
        p1.setEspecialidade("História");
        p1.setSalario(1800f);
        p1.receberAumento(200);
        System.out.println(p1.toString()); 
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Marcelo");
        t1.setSexo("M");
        t1.setIdade(21);
        t1.setRegistroProfissional(4444);
        t1.setMatricula(3333);
        t1.setCurso("Ferramentaria");
        t1.fazerAniver();
        t1.praticar();
        System.out.println(t1.toString());
        
    }
    
}
