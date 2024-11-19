import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        /*
         * Imprima a seguinte tabela, usando fors encadeados:
         * 1
         * 2 4
         * 3 6 9
         * 4 8 12 16
         * n n*2 n*3 .... n*n
         */

        int n;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Digite um valor positivo para n: ");
            n = teclado.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", i * j);
            }
            System.out.println(" ");
        }

        teclado.close();
    }
}
