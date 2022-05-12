import java.util.Scanner;

public class Arreglo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Nota: los arrreglos son homogeneos, siempre tiene mismo en tipo.
        //Buena practica: usar palabras en plural.
        int[] edades = new int[5];
        int suma=0;
        double promedio;

        //Guardando las edades:
        for (int i=0; i<edades.length; i++){
            System.out.printf("\n\t Edad[%d]: ",(i+1));
            edades[i]= scanner.nextInt(); scanner.nextLine();
            suma+=edades[i];
        } //Al finalizar tambien ya tenemos la suma de todas las edades.

        //Imprimiendo las edades en consola:
        // Foreach se usa para recorrer conjuntos de datos (arrays y ArrayList).
        System.out.print("\n\t EDADES: ");
        for (int edad : edades) { // edad va tomando cada valor de edades.
            System.out.printf("\t %d",edad);
        }

        promedio=suma/edades.length;

        System.out.printf("\n\t El promedio de las edades es: %.2f",promedio);


        scanner.close();
    }

}
