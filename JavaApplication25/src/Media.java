/***
 * Ejercicio 4
Dado el arreglo; determinar cuantos elementos están arriba de la media aritmética y cuantos están por debajo de la medía aritmética.

int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};

 * @author Cristhian Quizhpe
 */
public class Media {
    public static void main(String[] args) {
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int arribaMedia = 0, abajoMedia = 0;
        double media,suma = 0 ;

        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }

        media = suma / arreglo.length;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > media) {
                arribaMedia++;
            } else if (arreglo[i] < media) {
                abajoMedia++;
            }
        }

        // Imprimir resultados
        System.out.printf("Media aritmetica: %.2f%n" ,media);
        System.out.println("Elementos arriba de la media: " + arribaMedia);
        System.out.println("Elementos debajo de la media: " + abajoMedia);
    }
}

/***
 * run:
Media aritmetica: 9,54
Elementos arriba de la media: 8
Elementos debajo de la media: 5
BUILD SUCCESSFUL (total time: 0 seconds)
 */