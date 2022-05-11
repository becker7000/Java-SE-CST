import java.util.Scanner;

public class ComparandoCadenas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String codigo="1234x";

        System.out.print("\n\t Escribe el código: ");
        String codigoEntrada=scanner.nextLine();

        if (codigo.equals(codigoEntrada)){
            System.out.println("\n\t Acceso permitido...");
        }else
            System.out.println("\n\t Acceso denegado...");

        scanner.close();
    }


}
