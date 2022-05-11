import java.util.Scanner;

public class IfAnidado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int edad;
        double altura;

        System.out.print("\n\t Dame tu edad: ");
        edad=scanner.nextInt(); scanner.nextLine();
        System.out.print("\n\t Dame tu estatura: ");
        altura= scanner.nextDouble(); scanner.nextLine();

        if(edad>=18){
            if(altura>=1.4){
                System.out.print("\n\tPuedes subir al juego.");
            }else{
                System.out.print("\n\tLo sentimos, no puede subir.");
            }
        }else {
            System.out.print("\n\t Eres menor de edad.");
        }

        scanner.close();
    }

}
