import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int tamano, cont;
        System.out.print("Ingrese el número de marcas: ");
        tamano = tcl.nextInt();
        tcl.nextLine();
        String[] marcas = new String[tamano];
        for (cont = 0; cont < tamano; cont++) {
            System.out.print("Ingrese la marca del vehiculo: ");
            marcas[cont] = tcl.nextLine();
            if (marcas[cont].startsWith("A")
                    || marcas[cont].startsWith("C")
                    || marcas[cont].startsWith("T")) {
                System.out.println("No se puede ingresar marcas que empiecen con A, C o T. ");
                System.out.print("Ingrese la marca del vehiculo: ");
                marcas[cont] = tcl.nextLine();
            }
        }
        System.out.print("Las marcas de vehiculos ingresadas son: ");
        for (cont = 0; cont < tamano; cont++) {
            System.out.print(marcas[cont] + ", ");
        }
    }
}
/*
run:
Ingrese el n�mero de marcas: 4
Ingrese la marca del vehiculo: Kia
Ingrese la marca del vehiculo: Ford
Ingrese la marca del vehiculo: Toyota
No se puede ingresar marcas que empiecen con A, C o T. 
Ingrese la marca del vehiculo: Zuzuki
Ingrese la marca del vehiculo: Chevrolet
No se puede ingresar marcas que empiecen con A, C o T. 
Ingrese la marca del vehiculo: Mazda
Las marcas de vehiculos ingresadas son: Kia, Ford, Zuzuki, Mazda, BUILD SUCCESSFUL (total time: 48 seconds)
*/