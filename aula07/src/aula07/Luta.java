package aula07;

import java.util.Random;

public class Luta {
  private Lutador desafiado; 
  private Lutador desafiante;
  private int rounds;
  private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
  public void marcarLuta(Lutador L1, Lutador L2){
        if(L1.getCategoria().equals(L2.getCategoria()) && L1 != L2){
           this.aprovada = true;
           this.desafiado = L1;
           this.desafiante = L2;
        }else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
  
  public void Lutar(){
      if(this.aprovada == true){
          System.out.println(" ### DESAFIADO ### ");
          this.desafiado.apresentar();
          System.out.println(" ### DESAFIANTE ### ");
          this.desafiante.apresentar();
          
          Random aleatorio = new Random();
          int vencedor = aleatorio.nextInt(3); //0, 1 ou 2
          System.out.println("===== RESULTADO DA LUTA ===== "); 
          switch (vencedor){
              case 0:
                  System.out.println("Empate!");
                  this.desafiado.empatarLutar();
                  this.desafiante.empatarLutar();
                  break;
              case 1:
                  System.out.println(this.desafiado.getNome() + " é o vencedor da luta! ");
                  this.desafiado.ganharLuta();
                  this.desafiante.perderLuta();
                  break;
              case 2:
                  System.out.println(this.desafiante.getNome() + " é o vencedor da luta! ");
                  this.desafiante.ganharLuta();
                  this.desafiado.perderLuta();
                  break;
          }
          System.out.println("================================");
      } else {
          System.out.println(" A luta não pode acontecer! ");
      }
  }
  
  
} //linha da classe
