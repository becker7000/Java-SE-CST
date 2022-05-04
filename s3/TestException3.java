import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion=0;

        System.out.println("\n\t 1) Primera");
        System.out.println("\n\t 2) Segunda");
        System.out.println("\n\t 3) Tercera");
        System.out.println("\n\t 4) Cuarta");
        System.out.println("\n\t 5) Quinta");

        do {
            try{
                System.out.print("\n\t Opción: ");
                opcion=entrada.nextInt(); entrada.nextLine();
            }catch (InputMismatchException ex){
                System.out.print("\n\t"+ex.getMessage());
                System.out.println("\n\t El dato de entrada debe ser un entero.");
                opcion=1;
                entrada.nextLine();
                continue;
            }
        }while (opcion<1 || opcion>5);

        System.out.println("\n\t Excepción controlada...");

    }

}
