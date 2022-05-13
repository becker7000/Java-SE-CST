import java.io.File;

public class AnalizandoDirectorio {

    public static void main(String[] args) {

        File fileDir = new File("C:\\Users\\Erick\\Documents\\Curso Java CST\\Codes\\s3");
        File[] listaArchivos = fileDir.listFiles();

        //Mostramos al usuario la lista de archivos el directorio:
        for ( File archivo : listaArchivos ) {
            System.out.println(archivo);
        }

        System.out.printf("\n\t En este directorio hay: %d archivos.",listaArchivos.length);

    }

}
