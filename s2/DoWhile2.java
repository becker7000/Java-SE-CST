import java.util.Scanner;

public class DoWhile2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int dato;

        do{ //do-while ejecuta por lo menos una vez su bloque.
            System.out.print("\n\t Escribe un numero entre el rango: (0,4]U[8,10) => ");
            dato = entrada.nextInt(); entrada.nextLine();
        }while (dato<=0 || (dato>=5 && dato<=7) || dato>=10);

        System.out.println("\n\t Código aceptado...");

    }

}
