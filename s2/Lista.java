import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

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

        double menor=lista.get(0);
        for (double elem : lista) {
            if(elem<menor)
                menor=elem;
        }

        System.out.println("\n\t El menor elemento es: "+menor);

    }

}
