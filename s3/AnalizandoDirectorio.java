import java.io.File;

public class AnalizandoDirectorio {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Erick\\Documents\\Curso Java CST\\Codes\\s3");
        File[] listaArchivos = file.listFiles();

        for (File f:listaArchivos)
            System.out.println(f);

    }

}
