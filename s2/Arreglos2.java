import java.util.Scanner;

public class Arreglos2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] valores = new int[5];
        int x; //Variable a buscar.
        //Una vez que definimos un arreglo ya no podemos modificar
        //su tamaño.
        System.out.println("Dame 5 valores...");

        //Registrando un valor en cada posicion del arreglo.
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("\n\t Valor[%d]: ",(i+1));
            valores[i]= entrada.nextInt(); entrada.nextLine();
        }

        System.out.print("\n\t Dame un valor para buscarlo: ");
        x= entrada.nextInt(); entrada.nextLine();

        boolean banderilla=false;
        //Busqueda secuencial...
        for (int valor: valores ) {
            if(valor==x){
                System.out.println("\tEl valor "+x+" sí está en el arreglo.");
                banderilla=true;
                break;
            }
        }

        //Esto sucede cuando el valor no está en el arreglo.
        if(banderilla==false)
            System.out.println("\tEl valor "+x+" no pertenece al arreglo.");

    }

}
