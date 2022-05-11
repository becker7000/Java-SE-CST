import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        //Entrada de datos con el teclado desde la consola:
        Scanner scanner = new Scanner(System.in);

        //Instrucciones al usuario:
        System.out.print("\n\t Escribe una cantidad de segundos: ");
        int segundos = scanner.nextInt(); scanner.nextLine();

        System.out.printf("\n\t %d segundos son equivalentes a: ",segundos);

        // Calculos:
        int minutos = segundos/60;
        segundos=segundos%60;

        System.out.printf(" %d minutos con %d segundos.",minutos,segundos);


        //Cerrando el escaner.
        scanner.close();

    }

}
