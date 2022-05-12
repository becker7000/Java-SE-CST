import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\t Dame el rango de la matrix: ");
        int N = scanner.nextInt(); scanner.nextLine();
        int[][] matrix = new int[N][N];
        /*
        *       Indices de una matriz de 3x3:
        *
        *     [0][0]   [0][1]  [0][2]
        *     [1][0]   [1][1]  [1][2]
        *     [2][0]   [2][1]  [2][2]
        *
        *  RAM:  [0][0]  [0][1]  [0][2] [1][0] [1][1]  [1][2] [2][0]  [2][1]  [2][2]
        *
        *
        * */

        //Llenando la matriz con numeros aleatorios:
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=(int)(Math.random()*100);
            }
        }

        //Imprimiendo en forma de matriz:
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("\n"); //Un salto por fila.
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("\t %d", matrix[i][j]);
            }
        }

        scanner.close();
    }

}
