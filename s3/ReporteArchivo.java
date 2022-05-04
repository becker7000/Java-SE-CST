import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReporteArchivo {

    String nombre;

    public ReporteArchivo(String nombre) {
        this.nombre = nombre;
    }

    public void generarReporte() throws FileNotFoundException {

        File file = new File(this.nombre);

        System.out.printf("\n\t Nombre: %s",file.getName());
        System.out.printf("\n\t Ruta: %s",file.getAbsolutePath());
        System.out.printf("\n\t Existe el archivo? %B",file.exists());
        System.out.printf("\n\t Es archivo? %B",file.isFile());
        System.out.printf("\n\t Se puede leer? %B",file.canRead());

        //Ahora vamos a contar cuantas lineas tiene el archivo:
        int contador=0;
        Scanner entrada = new Scanner(file);

        while (entrada.hasNextLine()){
            entrada.nextLine();
            contador++;
        }
        System.out.printf("\n\t Total de lineas: %d",contador);
        entrada.close();

    }

}
