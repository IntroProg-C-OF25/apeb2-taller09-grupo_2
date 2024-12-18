
import java.util.Random;

public class Ejercicio07 {

    public static void main(String[] args) {
        Random random = new Random();
        double[] promedios = new double[28];
        double sumaprom = 0, prom = 0, mayor = 0, menor = 10;
        String mejor = "", peor = "";
        for (int i = 0; i < promedios.length; i++) {
            promedios[i] = random.nextDouble() * 10;
            sumaprom += promedios[i];
            if (mayor < promedios[i]) {
                mayor = promedios[i];
                mejor = "Estudiante " + i;
            } else if (menor > promedios[i]) {
                menor = promedios[i];
                peor = "Estudiante " + i;
            }
        }
        prom = sumaprom / 28;
        System.out.printf("El promedio del Paralelo c es: %.2f\n", prom);
        System.out.println("Los estudiantes por encima del promedio son: ");
        for (int i = 0; i < 10; i++) {
            if (promedios[i] > prom) {
                System.out.printf("%.2f\n", promedios[i]);
            }
        }
        System.out.println("Los estudiantes por debajo del promedio son: ");
        for (int i = 0; i < 10; i++) {
            if (promedios[i] <= prom) {
                System.out.printf("%.2f\n", promedios[i]);
            }
        }
        System.out.printf("El estudiante con la mejor calificacion es: " + mejor + ", con promedio de: %.2f\n", mayor);
        System.out.printf("El estudiante con la peor calificacion es: " + peor + ", con promedio de: %.2f\n", menor);
    }
}
/*
run:
El promedio del Paralelo c es: 5.40
Los estudiantes por encima del promedio son: 
9.03
9.51
5.97
9.72
Los estudiantes por debajo del promedio son: 
2.41
1.37
3.41
1.95
0.62
4.24
El estudiante con la mejor calificacion es: Estudiante 8, con promedio de: 9.72
El estudiante con la peor calificacion es: Estudiante 11, con promedio de: 0.53
*/