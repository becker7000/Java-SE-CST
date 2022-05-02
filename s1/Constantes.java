import static java.lang.Math.pow;

public class Constantes {

    public static void main(String[] args) {

        double radio = 3.4f;
        double area = Math.PI*pow(radio,2);

        System.out.printf("\n\t Radio = %.3f \n\t PI = %f " +
                          "\n\t Área = %.3f",radio,Math.PI,area);

    }
}
