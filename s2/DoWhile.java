import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        //Do-while me ayuda a verificar que un número
        //este dentro de un rango.
        //Esta estructura ejecuta su bloque de código mínimo una vez.
        Scanner scanner = new Scanner(System.in);
        int entero;

        do { //Filtro de un número para que sea positivo.
            System.out.printf("\n\t Dame un número entero positivo: ");
            entero=scanner.nextInt(); scanner.nextLine();
        }while(entero<0);

        System.out.println("\n\t El número es positivo.");
        scanner.close();

    }

}
