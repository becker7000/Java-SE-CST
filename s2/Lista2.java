import java.util.ArrayList;
import java.util.Scanner;

public class Lista2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Double> lista = new ArrayList<>();

        System.out.print("\n\t Dame el número de elementos: ");
        int tam = entrada.nextInt(); entrada.nextLine();

        for (int i = 0; i < tam; i++) {
            System.out.printf("\n\t Elemento %d: ",i);
            double x=entrada.nextDouble(); entrada.nextLine();
            lista.add(x);
        }

        double num;
        System.out.print("\n\t Dame un numero de la lista para borrarlo: ");
        num= entrada.nextDouble(); entrada.nextLine();

        for (double elem : lista) {
            if(elem==num){
                System.out.print("\n\t El número "+num+" sí está en la lista.");
                lista.remove(elem);
                System.out.println("\n\t Elemento eliminado.");
                break;
            }
        }

        //Nota:  lista.size(); nos devuelve el tamaño de la lista.

        System.out.print("\n\t Lista actual: ");
        for (double elem : lista) {
            System.out.printf("\t %.2f",elem);
        }

        entrada.close();

    }

}
