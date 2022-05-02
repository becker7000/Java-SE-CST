import java.util.Scanner;

public class If2 {

    public static void main(String[] args) {

        //Scanner es una clase de java.util
        Scanner entrada = new Scanner(System.in);

        System.out.print("\n\t Escribe un valor entero: ");
        int x=entrada.nextInt(); //Registra el siguiente entero con el teclado.
        entrada.nextLine(); //Nos ayuda a cerrar la linea.
        int formula=x*2-3+x;

        if(formula%2==0)
            System.out.println("\n\t Es par ("+formula+")");
        else
            System.out.println("\n\t Es impar ("+formula+")");

        entrada.close();

    }

}
