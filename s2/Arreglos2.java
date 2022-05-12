import java.util.Scanner;

public class Arreglos2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[5];
        int x;
        boolean banderilla=false;

        //Guardando las edades:
        for (int i=0; i<valores.length; i++){
            System.out.printf("\n\t Valor[%d]: ",(i+1));
            valores[i]= scanner.nextInt(); scanner.nextLine();
        }

        // Escribir un código que nos pida un número
        // y busque si el número es dentro del arreglo.
        // si está lo imprime y sino está nos avisa.

        System.out.print("\n\t Dame un valor para buscarlo: ");
        x=scanner.nextInt(); scanner.nextLine();

        //Algoritmo que busca un entero en el arreglo:

        for (int valor : valores) {
            if(valor==x){
                System.out.printf("\n\t El valor %d sí esta dentro del arreglo",valor);
                banderilla=true; //Indicador de que sí se encontró el valor.
                break; // Rompe con las siguiente iteraciones de for.
            }
        }

        //Bloque en caso de que no se encuentre el valor.
        if(!banderilla) // !(false) -> true
            System.out.printf("\n\t El valor %d no está en el arreglo.",x);

        scanner.close();
    }

}
