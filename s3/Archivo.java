import java.io.File;
import java.io.IOException;

public class Archivo {

    public static void main(String[] args) throws IOException {

        //File es una clase que obtiene datos de una archivo o directorio.
        File file= new File("nuevo.txt");

        if(!file.exists()){ //Esto nos ayuda a no tener duplicados.
            file.createNewFile(); //Este método nos puede generar excepciones.
        }

        file.renameTo(new File("datos.txt"));

    }

}
