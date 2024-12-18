
public class Ejercicio05 {

    public static void main(String[] args) {
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan",
        "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
        for (int i = 0; i < 7; i++) {
            if (promedios[i] <= 5.9){
                promediosCualitativos[i] = "Regular";                      
            } else if (promedios[i] >=6 && promedios[i] <= 8.9) {
                promediosCualitativos[i] = "Bueno";  
            } else if (promedios[i] >=9 && promedios[i] <= 10) {
                promediosCualitativos[i] = "Sobresaliente"; 
            }
            System.out.println(estudiantes[i]+"promedio: " + promedios[i] + " es: " + promediosCualitativos[i]);
        } 
    }
}
/*
run:
Kimberly Gonzalezpromedio: 10.0 es: Sobresaliente
Mark Hoganpromedio: 10.0 es: Sobresaliente
Teresa Martinezpromedio: 9.1 es: Sobresaliente
Julia Johnsonpromedio: 7.0 es: Bueno
Mark Cookpromedio: 6.1 es: Bueno
Jennifer Manningpromedio: 4.0 es: Regular
Juan Vasquezpromedio: 8.0 es: Bueno
*/