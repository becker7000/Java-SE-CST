import java.util.Scanner;

public class DoWhile2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int entero;

        do { //Sí son validos: 1,2,3,4,8,9,10
            System.out.printf("\n\t Dame un número entero en [1,4] U [8,10]: ");
            entero=scanner.nextInt(); scanner.nextLine();
        }while(entero<1 || (entero>=5 && entero<=7) || entero>10 );

        System.out.println("\n\t El número es valido y es: "+entero);
        scanner.close();

    }

}
