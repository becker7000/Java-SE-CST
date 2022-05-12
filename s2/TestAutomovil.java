public class TestAutomovil {

    public static void main(String[] args) {

        Automovil a1 = new Automovil("Ford","Fusion","QWE1234");
        Automovil a2 = new Automovil("Toyota","Corolla","ABC1235");
        Automovil a3 = new Automovil("Subaru","XV","LUJ0034");
        a2.setPlacas("TYG1023");
        a1.setModelo("Altima");
        a1.setMarca("Nissan");

        a1.mostrar();
        a2.mostrar();
        a3.mostrar();

    }

}
