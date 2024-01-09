import java.util.Scanner;
public class jogadores
{
    public String nome;
    Scanner read = new Scanner(System.in);
    public void alocarNavio(int[][] matriz){
        char horORver;
        int linha, coluna;
        System.out.println("deseja que seu navio seja na horizontal ou vertical?: ");
        horORver = read.nextLine().charAt(0);
        System.out.println("digite a posicao que quer que seu navio esteja: ");
        System.out.println("linha: ");
        linha = read.nextInt();
        System.out.println("coluna: ");
        coluna = read.nextInt();
        if (horORver == 'H'){
            for (int i = 0; i < 3; i++)
            {
                matriz[linha][coluna] = 1;
                coluna++;
            }
        }
        else{
            for (int i = 0; i < 3; i++)
            {
                matriz[linha][coluna] = 1;
                linha++;
            }
        }
    }
    public int atirar(int matriz[][]){
        int linha, coluna;
        System.out.println("insira a posicao que deseja atirar");
        System.out.println("linha: ");
        linha = read.nextInt();
        System.out.println("coluna: ");
        coluna = read.nextInt();
        if (matriz[linha][coluna] == 1)
        {
            return 1;
        }
        return 0;
    }
}
