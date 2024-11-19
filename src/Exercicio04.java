public class Exercicio04 {
    public static void main(String[] args) {
        /*
         * Imprima os fatoriais de 1 a 10.
         * O fatorial de um número é n * (n-1) * (n-2) ... até n = 1. Lembre-se de utilizar os parênteses.
         * 
         * O fatorial de 0 é 1
         * O fatorial de 1 é (0!) * 1 = 1
         * O fatorial de 2 é (1!) * 2 = 2
         * O fatorial de 3 é (2!) * 3 = 6
         * O fatorial de 4 é (3!) * 4 = 24
         * 
         * Faça um for que inicie uma variável n (número) como 1 e fatorial (resultado) como 1 e varia n de 1 até 10:
         */

        int fatorial = 1;
        for (int n = 1; n <= 10; n++) {
            fatorial *= n;
            System.out.printf("O fatorial de %d é %d * (%d!) = %d%n", n, n, n - 1, fatorial);
        }
    }
}
