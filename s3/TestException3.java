import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion=0;

        while (opcion!=3){
            System.out.println("\n\t Selecciona una opcion: ");
            System.out.print("\n\t 1) Opcion uno");
            System.out.print("\n\t 2) Opcion dos");
            System.out.print("\n\t 3) Opcion tres");

            do{
                try{
                    System.out.print("\n\t Opcion => ");
                    opcion= scanner.nextInt(); scanner.nextLine();
                }catch (InputMismatchException exception){
                    System.out.println("\n\t"+exception.getMessage());
                    System.out.print("\n\t El valor debe de ser un entero.");
                    opcion=0;
                    break;
                }
            }while (opcion<1 || opcion>3);


            System.out.println("\n\t Excepcion controlada,pulsa enter ");
            scanner.nextLine();
        }
    }

}
