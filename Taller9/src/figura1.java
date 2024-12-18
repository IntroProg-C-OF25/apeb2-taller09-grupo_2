/***
Ejercicio 1
Con el objetivo practicar el uso del ciclo repetitivo for, se propone que dado un límite, se presenten las siguientes figuras. Por ejemplo si el límite es 4:

Figura 1:

*
**
***
****
Figura 2:

     *
    ***
   *****
  *******
Figura 3:

     *
    ***
   *****
  *******
   *****
    ***
     *
*/
import java.util.Scanner;
public class figura1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingresa el limite: ");
        int limite = input.nextInt();

        System.out.println("Figura 1:");
        for (int i = 1; i <= limite; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Figura 2:");
        for (int i = 1; i <= limite; i++) {
            for (int j = 1; j <= limite - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Figura 3:");
        for (int i = 1; i <= limite; i++) {
            for (int j = 1; j <= limite - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = limite - 1; i >= 1; i--) {
            for (int j = 1; j <= limite - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
    }
}
/***
run:
Ingresa el limite: 6
Figura 1:
*
**
***
****
*****
******
Figura 2:
     *
    ***
   *****
  *******
 *********
***********
Figura 3:
     *
    ***
   *****
  *******
 *********
***********
 *********
  *******
   *****
    ***
     *
BUILD SUCCESSFUL (total time: 3 seconds)
*/
