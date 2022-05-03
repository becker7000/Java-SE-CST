import java.util.Scanner;

public class Arreglos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] edades = new int[6];
        int suma=0; //Las sumas inician en cero.
        //Una vez que definimos un arreglo ya no podemos modificar
        //su tamaño.
        System.out.println("Dame 6 edades...");

        //Registrando un valor en cada posicion del arreglo.
        for (int i = 0; i < edades.length; i++) {
            System.out.printf("\n\t Edad[%d]: ",(i+1));
            edades[i]= entrada.nextInt(); entrada.nextLine();
            suma+=edades[i];
        }

        System.out.print("\n\t Edades: ");
        for (int edad : edades) //foreach: una variable del tipo de dato del arreglo
            System.out.print(" "+edad); //luego recibe el nombre del arreglo.

        System.out.println("\n\tEl promedio de edades es: "+(suma/edades.length));

    }

}
