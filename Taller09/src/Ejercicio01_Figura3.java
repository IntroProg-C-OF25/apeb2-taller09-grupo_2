
public class Ejercicio01_Figura3 {
    public static void main(String[] args) {
        int filas = 4;
        
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = filas - 1; i >= 1; i--) {
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
run:
   *
  ***
 *****
*******
 *****
  ***
   *
*/