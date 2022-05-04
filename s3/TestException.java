public class TestException {

    public static void main(String[] args) {

        String sSueldo="1000x";
        try {
            double dSueldo=Double.parseDouble(sSueldo);
            System.out.println("Sueldo: "+dSueldo);
        }catch (NumberFormatException ex){
            System.out.print("\n\t"+ex.getMessage());
            System.out.println("\n\t La cadena contiene una letra.");
        }

        //Error de casting de tipos de datos.

    }

}
