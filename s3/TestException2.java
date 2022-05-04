public class TestException2 {

    public static void main(String[] args) {

        int a=5, b=0;
        try{
            int resultado=a/b;
            System.out.println(resultado);
        }catch (ArithmeticException ex){
            System.out.println("\n\t "+ex.getMessage());
            System.out.println("\n\t La división por cero, está prohibida.");
        }finally {
            b=1;
            int resultado=a/b;
            System.out.println("\n\t El resultado es: "+resultado);
        }

    }

}
