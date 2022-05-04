public class TestReporte {

    public static void main(String[] args) {

        Recibo r1 = new Recibo(500);
        Recibo r2 = new Recibo(1150);
        Recibo r3 = new Recibo(1830);

        r1.generarReporte();
        r2.generarReporte();
        r3.generarReporte();

    }

}
