public class TestException {

    public static void main(String[] args) {

        String sSueldo="1000x";
        try{
            double dSueldo=Double.parseDouble(sSueldo);
            System.out.printf("\n\t El sueldo es: %.2f",dSueldo);
        }catch (NumberFormatException exception){
            System.out.print("\n\t "+exception.getMessage());
            System.out.println("\n\t La cadena contiene letra(s).");
        }catch (Exception exception){
            System.out.println("\n\t "+exception.getMessage());
        }

        System.out.print("\n\t El programa continúa...");

    }

}
