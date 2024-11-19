public class Exercicio06 {
    public static void main(String[] args) {
        /*
         * Imprima os primeiros números da série de Fibonacci até passar de 100. A série de Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc... 
         * Para calculá-la, o primeiro elemento vale 0, o segundo vale 1, daí por diante, o n-ésimo elemento vale o (n-1)-ésimo elemento somado ao (n-2)-ésimo elemento
         * (ex: 8 = 5 + 3).
         */

        int ant = 0, prox = 1, soma = 0;

        while (soma < 100) {
            System.out.println(soma);
            ant = prox;
            prox = soma;
            soma = ant + prox;
        }
    }
}
