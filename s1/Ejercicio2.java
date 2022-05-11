import java.io.IOException;
import java.util.Scanner;
import static java.lang.Math.pow;

public class Ejercicio2 {

    public static void main(String[] args) {

        //Nota: las librerias necesarias se mandan a llamar con alt+enter.
        Scanner scanner = new Scanner(System.in);

        ProcessBuilder pc = new ProcessBuilder("cmd","/c","cls");
        Process iniciarProceso= null;
        try {
            iniciarProceso = pc.inheritIO().start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            iniciarProceso.waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Datos de entrada:
        System.out.print("\n\t Dame tu altura: ");
        double altura= scanner.nextDouble(); scanner.nextLine();
        System.out.print("\n\t Dame tu peso: ");
        double peso = scanner.nextDouble(); scanner.nextLine();

        //Calculos: (índice de masa corporal)
        double imc=peso/(pow(altura,2));

        //Salidas:
        System.out.printf("\n\t Tu índice de masa corporal es: %.2f",imc);

        scanner.close();

    }

}
