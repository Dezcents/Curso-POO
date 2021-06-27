package aula09;
public class Aula09 {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa [2];
        p[0] = new Pessoa();
        p[0].Pessoa("Isabella", "F", 20);
        p[0].status();
        
        p[1] = new Pessoa();
        p[1].Pessoa("Marcus", "M", 21);
        p[1].status();
        p[1].fazerAniver();
        p[1].status();
        
        Livro l [] = new Livro [3];
        l[0] = new Livro();
        l[0].Livro("O livro de Cam", "Lauren Kate", 304, p[0]);
        l[0].abrir();
        l[0].detalhes();
        l[0].fechar();
        l[0].detalhes();
        
        
        l[1] = new Livro();
        l[1].Livro("Quando a noite cai", "Karina Rissi", 445, p[0]);
        l[1].abrir();
        l[1].folhear(120);
        l[1].avancarPag();
        l[1].detalhes();
        
        l[2] = new Livro();
        l[2].Livro("Procura-se um marido", "Karina Rissi", 472, p[1]);
        l[2].abrir();
        l[2].folhear(300);
        l[2].voltarPag();
        l[2].detalhes();
       
    }
    
}
