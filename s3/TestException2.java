public class TestException2 {

    public static void main(String[] args) {

        int a=5, b=0;

        try{
            int resultado=a/b;
            System.out.printf("\n\t Resutado: %d",resultado);
        }catch (ArithmeticException exception){
            System.out.println("\n\t "+exception.getMessage());
            System.out.print("\n\t Error generado por dividir por cero.");
        }

    }

}
