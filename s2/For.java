import java.util.Scanner;

import static java.lang.Math.pow;

public class For {

    public static void main(String[] args) {
        /*
        * Usamos while y do-while cuando sabemos en qué momento bajo una condición
        * ya no se debe iterar el bucle, en cambio, usamos for cuando
        * sabemos el número exacto de iteraciones.
        * */

        Scanner entrada = new Scanner(System.in);
        System.out.print("\n\t Escribe un entero: ");
        int base = entrada.nextInt(); entrada.nextLine();
        System.out.println();
        //Variable de control, condición e incremento.
        for (int i = 1; i <= 10; i++) {
            int potencia=(int)pow(base,i); //Nota: pow devuelve un valor double.
            System.out.printf("\n\t (%d)^(%d)=%d ",base,i,potencia);
        }

    }

}
