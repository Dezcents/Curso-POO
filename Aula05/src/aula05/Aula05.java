package aula05;
public class Aula05 {
    public static void main(String[] args) {
       ContaBanco p1 = new ContaBanco();
       p1.setNumConta(1111);
       p1.setDono("Marcus");
       p1.abrirConta("CC");
       p1.depositar(300);
       p1.sacar(350);
       p1.fecharConta();
       
       ContaBanco p2 = new ContaBanco();
       p2.setNumConta(2222);
       p2.setDono("Isabella");
       p2.abrirConta("CP");
       p2.depositar(500);
       p2.sacar(100);
       
       
       p1.estadoAtual();
       p2.estadoAtual();
       
    }
    
}
