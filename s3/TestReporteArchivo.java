import java.io.FileNotFoundException;

public class TestReporteArchivo {

    public static void main(String[] args) throws FileNotFoundException {

        ReporteArchivo reporte = new ReporteArchivo("datos.txt");

        reporte.generarReporte();

    }

}
