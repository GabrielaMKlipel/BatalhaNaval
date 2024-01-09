import java.util.Scanner;
public class Main {
    public static void main (String[] args)
    {
        int[][] mar = new int[11][11];
        jogadores player = new jogadores();
        tabuleiro oceano = new tabuleiro();
        player.nome = "mauro";
        player.alocarNavio(mar);
        oceano.mostrar(mar);
        System.out.println(player.atirar(mar));
    }
}