public class Exercicio05 {
    public static void main(String[] args) {
        /*
         * No código do exercício anterior, aumente a quantidade de números que terão os fatoriais impressos, até 20, 30, 40. 
         * Em um determinado momento, além desse cálculo demorar, vai começar a mostrar respostas completamente erradas.Por quê?
         * Mude de int para long para ver alguma mudança.
         */

        long fatorial = 1;
        for (int n = 1; n <= 40; n++) {
            fatorial *= n;
            System.out.printf("O fatorial de %d é %d * (%d!) = %d%n", n, n, n - 1, fatorial);
        }

        // Utilizar int nesse caso não faz sentido porque existe um limite para o valor que pode ser armazenado. Fatoriais de 20, 30, 40 são números grandes demais para "caber" nesse limite. Na verdade, nem mesmo o long será suficiente.
    }
}