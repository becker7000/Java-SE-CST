import java.util.Scanner;

public class If3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        final String NIP="1234";
        System.out.print("\n\t Escribe el NIP: ");
        String datoEntrada=entrada.nextLine();

        if (NIP.equals(datoEntrada))
            System.out.println("\n\t NIP aceptado, bienvenid@");
        else
            System.out.println("\n\t Acceso denegado, NIP incorrecto!");

        entrada.close();
    }

}
/*
*  Double num = 7.6;
*  int aux=(int)num;
* */