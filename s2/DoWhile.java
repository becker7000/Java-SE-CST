import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int dato; //Declaración global

        //Filtrando un valor entre 1 y 5.
        do{ //do-while ejecuta por lo menos una vez su bloque.
            System.out.print("\n\t Escribe un numero entre 1 y 5: ");
            dato = entrada.nextInt(); entrada.nextLine();
        }while (dato<1 || dato>5);

        System.out.println("\n\t Valor del número: "+dato);
        entrada.close();
    }

}
