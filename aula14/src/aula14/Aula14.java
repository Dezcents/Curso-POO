package aula14;
public class Aula14 {
    public static void main(String[] args) {
        Video v[] = new Video[2];
        v[0] = new Video();
        v[0].Video("Aula 1 de POO");
        v[1] = new Video();
        v[1].Video("Aula 12 de PHP");
        
        Gafanhoto g [] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Marcus", 22, "M", "exemplo.login@gmail.com");
        g[1] = new Gafanhoto ("Isabella", 20, "F", "login.exemplo@hotmail.com");
        
        System.out.println("\nVISUALIZAÇÃO\n---------------------------------");
        Visualizacao vis[] = new Visualizacao[3];
        
        vis[0] = new Visualizacao();
        vis[0].Visualizacao(g[0], v[0]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao ();
        vis[1].Visualizacao(g[0], v[1]);
        vis[1].avaliar(9);
        System.out.println(vis[1].toString());
        
        vis[2] = new Visualizacao();
        vis[2].Visualizacao(g[1], v[0]);
        vis[2].avaliar(91.4f);
        System.out.println(vis[2].toString());
        
        System.out.println("VÍDEOS\n-----------------------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        
        System.out.println("\nGAFANHOTOS\n-----------------------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString() );
    }
}
