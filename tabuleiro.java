import java.util.Scanner;
public class tabuleiro {
    Scanner read = new Scanner(System.in);
    public void mostrar(int[][] matriz){
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++)
            {
                if (i == 0){
                    System.out.printf("%d ", j);
                }
                else{
                    if (j == 0){
                        System.out.printf("%d ", i);
                    }
                    else{
                        System.out.printf("%d ", matriz[i][j]);
                    }
                }
            }
            System.out.println();
        }
    }
}
