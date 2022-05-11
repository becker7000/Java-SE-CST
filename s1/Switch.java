import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.print("\n\t Selecciona un opcion.");
        System.out.print("\n\t 1) Primera opcion.");
        System.out.print("\n\t 2) Segunda opcion.");
        System.out.print("\n\t 3) Tercera opcion.");
        System.out.print("\n\t 4) Cuarta opcion.");
        System.out.print("\n\t Opcion: ");
        opcion= scanner.nextInt(); scanner.nextLine();

        switch (opcion){
            case 1:
                System.out.println("\n\t Soy la primera opcion.");
                break;
            case 2:
                System.out.println("\n\t Soy la segunda opcion");
                break;
            case 3:
                System.out.println("\n\t Soy la tercera opcion");
                break;
            case 4:
                System.out.println("\n\t Soy la cuarta opcion");
                break;
            default:
                System.out.println("\n\t Soy una opcion no contemplada");
        }

        scanner.close();
    }

}
