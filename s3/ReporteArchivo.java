import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReporteArchivo {

    String nombre;

    public ReporteArchivo(String nombre) {
        this.nombre = nombre;
    }


    //Comportamiento con el método:
    public void generarReporte() throws FileNotFoundException {

        File file = new File(this.nombre);

        System.out.printf("\n\t Nombre: %s",file.getName());
        System.out.printf("\n\t Ruta: %s",file.getAbsolutePath());
        System.out.printf("\n\t Existe el archivo? %B",file.exists());
        System.out.printf("\n\t Es archivo? %B",file.isFile());
        System.out.printf("\n\t Se puede leer? %B",file.canRead());

        //Ahora vamos a contar cuanta lineas tiene el archivo:
        int contador=0;
        Scanner scanner = new Scanner(file);
        //Este scanner con file puede generar una excepción.

        while (scanner.hasNextLine()){ //Vamos preguntado si hay siguiente linea
            scanner.nextLine(); //Vamos saltando linea por linea.
            contador++;
        }

        System.out.printf("\n\t El total de lineas del archivo es: %d",contador);
        scanner.close();
    }
}
