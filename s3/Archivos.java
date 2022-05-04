import java.io.File;
import java.io.IOException;

public class Archivos {

    public static void main(String[] args) throws IOException {

        //File es una clase para obtener información de un archivo.
        File file = new File("nuevo.txt");

        if (!file.exists())
            file.createNewFile();

        file.renameTo(new File("datos.txt"));

    }

}
