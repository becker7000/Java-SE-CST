import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Existen unas clase especiales, llamadas clase envolvedoras.
        // int -> Integer, double -> Double
        //ArrayList me permite crear listas dinamicas.
        ArrayList<Double> lista = new ArrayList<>();
        int tamano;
        System.out.print("\n\t Dame el tamaño de la lista: ");
        tamano=scanner.nextInt(); scanner.nextLine();

        for(int i=0; i<tamano; i++){
            System.out.printf("\n\t Elemento %d: ",i);
            double x=scanner.nextDouble(); scanner.nextLine();
            lista.add(x); // Memoria dinamica
        }

        //Imprimiendo la lista:
        System.out.print("\n\t LISTA: ");
        double menor = lista.get(0); //Accedemos a la primera posicion de la lista
        for (double elemento : lista) {
            System.out.printf("\t [%.0f]",elemento);
            if(elemento<menor) //Este bloque encuentra el menor.
                menor=elemento;
        }

        System.out.printf("\n\t El elemento menor es: %.2f",menor);







    }

}
