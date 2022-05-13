public class TestReciboCFE {

    public static void main(String[] args) {

        ReciboCFE c1 = new ReciboCFE(500); //t1
        ReciboCFE c2 = new ReciboCFE(1150); //t2
        ReciboCFE c3 = new ReciboCFE(1890); //t3

        c1.generarReporte();
        c2.generarReporte();
        c3.generarReporte();

    }

}
