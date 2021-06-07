package atividadeaula02;
public class AtividadeAula02 {

    public static void main(String[] args) {
        Aula a1 = new Aula ();
        a1.aluno = " Marcus Vinícius ";
        a1.data = " 06/06/2021 ";
        a1.professor = " Guanabara ";
        a1.inicio = " 21:30 " ;
        a1.termino = " 22:30 ";
        //a1.duracao = 1; ACRESCENTAR METODO DURAÇÃO //
        
        a1.status();
        a1.comecarAula();
        a1.terminarAula();
        a1.fazerExercicio();
        a1.cancelarAula();
        
        VideoGame v1 = new VideoGame();
        v1.marca = "Playstation 3";
        v1.dono = "Marcus Vinícius ";
        v1.preco = 1.500;
        v1.numeroSerie = 123456789;
        
        v1.status();
        v1.ligando();
        v1.funcionando();
        
        VideoGame v2 = new VideoGame();
        v2.marca = "XBOX";
        v2.dono = "Carlos Michel";
        v2.preco = 1.200;
        v2.numeroSerie = 987654321;
        
        v2.status();
        v2.desligando();
        v2.funcionando();
    }
    
}
