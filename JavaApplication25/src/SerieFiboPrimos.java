public class SerieFiboPrimos {
    public static void main(String[] args) {
        int limite = 10; // Número de términos a mostrar
        int fibo1 = 1, fibo2 = 1; // Variables para Fibonacci
        int fibonacci, numeroPrimo = 2; // Variables para Fibonacci y números primos
        boolean esPrimo;

        System.out.println("Serie Fibonacci / Primos:");

        for (int i = 0; i < limite; i++) {
            // Mostrar la combinación actual de Fibonacci / Primo
            System.out.print(fibo1 + "/" + numeroPrimo + ", ");

            // Calcular el siguiente número de Fibonacci
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;

            // Encontrar el siguiente número primo
            for (int j = numeroPrimo + 1; ; j++) { // Ciclo infinito controlado
                esPrimo = true;
                for (int k = 2; k <= j / 2; k++) { // Verificación de número primo
                    if (j % k == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) { // Si encontramos un primo, actualizamos la variable
                    numeroPrimo = j;
                    break;
                }
            }
        }
        System.out.println(); // Salto de línea final
    }
}
/***
 * Serie Fibonacci / Primos:
1/2, 1/3, 2/5, 3/7, 5/11, 8/13, 13/17, 21/19, 34/23, 55/29, 
BUILD SUCCESSFUL (total time: 0 seconds)
 */