import java.util.Scanner;

public class Switch1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("\n\t Elige una opcion:" +
                            "\n\t 1) Opcion uno." +
                            "\n\t 2) Opcion dos." +
                            "\n\t 3) Opcion tres." +
                            "\n\t => ");
        int opcion= entrada.nextInt(); entrada.nextLine();

        switch (opcion){
            case 1:
                System.out.println("Hola soy la primera opción.");
                break;
            case 2:
                System.out.println("Hola soy la segunda opción.");
                break;
            case 3:
                System.out.println("Hola soy la tercera opción.");
                break;
            default: //Opcional
                System.out.println("Hola soy una opción no contemplada.");
                break;
        }

        entrada.close();

    }

}
