import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        /*
         * Escreva um programa que, dada uma variável x com algum valor inteiro, temos um novo x de acordo com a seguinte regra:
         * se x é par, x = x / 2
         * se x é impar, x = 3 * x + 1
         * imprime x
         * O programa deve parar quando x tiver o valor final de 1. Por exemplo, para x = 13, a saída será: 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
         */

        int x = 0;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Digite um valor positivo para x: ");
            x = teclado.nextInt();
        } while (x <= 0);

        System.out.print("Sequência: ");
        while (x != 1) {
            System.out.print(x + " -> ");
            if (x % 2 == 0) {
                x /= 2;
            } else {
                x = 3 * x + 1;
            }
        }
        System.out.println(x);

        teclado.close();
    }
}
