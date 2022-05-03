import java.util.Scanner;

public class If5 {

    //Tricotomia de un numero entero: negativo, cero o positivo.

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //int entero = entrada.nextInt(); entrada.nextLine();
        System.out.print("\n\tEscribe un número entero: ");
        int entero = Integer.parseInt(entrada.nextLine());

        if(entero>0)
            System.out.println("\tEl número es positivo.");
        else if(entero<0)
            System.out.println("\tEl número es negativo.");
        else
            System.out.println("\tEl número es exactamente cero.");

        entrada.close();
    }

}
