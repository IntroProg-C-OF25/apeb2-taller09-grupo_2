/***
 * Ejercicios 6
Analice el siguiente código

Scanner entrada = new Scanner(System.in);
String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
String inicial;
boolean bandera = true;
while(bandera){
    System.out.println("Ingrese una letra");
    inicial = entrada.nextLine();
 }
Modifique el ciclo repetitivo para que salga del mismo, cuando el usuario ingrese por teclado una letra que coincida con 
* la primera letra de los "nombres" contenidos en del arreglo estudiantes. Debe usar un ciclo repetitivo para recorrer 
* el arreglo estudiantes, y no quemar de forma constante dichas iniciales, imagine que estudiantes podría contener millón 
* de nombres, por lo que fijar iniciales, es ineficiente.
 * @author Cristhian Quizhpe
 */
import java.util.Scanner;
public class Iniciales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;
        boolean bandera = true;

        while (bandera) {
            System.out.println("Ingrese una letra:");
            inicial = input.nextLine();

            for (int i = 0; i < estudiantes.length; i++) {
                if (estudiantes[i].startsWith(inicial)) {
                    bandera = false; // Salir del ciclo si hay coincidencia
                    break;
                }
            }
        }

        System.out.println("Letra coincide con un nombre del arreglo. Saliste del ciclo.");
    }
}
/***
run:
Ingrese una letra:
M
Letra coincide con un nombre del arreglo. Saliste del ciclo.
BUILD SUCCESSFUL (total time: 5 seconds)
*/
