import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestFileReader {

    public static void main(String[] args) {

        try{

            File file = new File("datos.txt");
            FileReader reader = new FileReader(file);
            Scanner scanner = new Scanner(file);
            int numeroLineas=scanner.nextInt(); scanner.nextLine();
            System.out.printf("\n\t El número de lineas es: %d",numeroLineas);

            for (int i = 1; i < numeroLineas; i++) { //i es el número de línea.

                int x= scanner.nextInt();
                int y= scanner.nextInt();
                int z= scanner.nextInt();

                if(i<(numeroLineas-1))
                    scanner.nextLine();

                System.out.printf("\n\t linea %d -> x = %d, y = %d, z = %d",i,x,y,z);

                double suma=x+y+z; //Coercion implicita (int (32bits) -> double (64bits)).
                double promedio= suma/3.0;

                System.out.printf("\n\t El promedio de linea es: %.3f",promedio);

            }
            System.out.println();
            scanner.close();
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n\t Procesamiento exitoso....");

    }

}
