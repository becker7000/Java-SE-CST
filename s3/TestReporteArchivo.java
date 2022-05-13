import java.io.FileNotFoundException;

public class TestReporteArchivo {

    public static void main(String[] args) throws FileNotFoundException {

        ReporteArchivo reporteArchivo = new ReporteArchivo("datos.txt");
        reporteArchivo.generarReporte();

    }

}
