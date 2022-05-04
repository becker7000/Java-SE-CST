import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TestFileReader {

    public static void main(String[] args) {

        try{
            File file = new File("datos.txt");
            FileReader reader = new FileReader(file);
            Scanner entrada = new Scanner(reader);
            int numeroLineas = entrada.nextInt(); entrada.nextLine();

            System.out.printf("\n\t Número de lineas: %d",numeroLineas);
            for(int i=1;i<=numeroLineas;i++){
                int x = entrada.nextInt();
                int y = entrada.nextInt();
                int z = entrada.nextInt(); entrada.nextLine();
                System.out.printf("\n\t %d. x=%d, y=%d, z=%d",i,x,y,z);
                int suma = x+y+z;
                float promedio = suma/3.0f;
                System.out.printf("\t | suma: %d -> promedio: %.3f",suma,promedio);
            }
            System.out.println();
            entrada.close();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (NoSuchElementException ex){
            System.out.println("\n\t Esta es una excepción: "+ex.getMessage());
        }finally {
            System.out.println("\n\t Fin del analisis de datos.");
        }


    }

}
