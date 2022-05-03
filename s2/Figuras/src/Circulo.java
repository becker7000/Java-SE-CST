import static java.lang.Math.pow;

public class Circulo {

    //Atributo:
    private  double radio;
    public static int numCirculos=0;


    //El constructor siempre lleva el mismo nombre de la clase
    public Circulo(double radio) {
        this.radio = radio;
        numCirculos++;
    }

    //Este método nos devuelve el valor de radio.
    public double getRadio() {
        return radio;
    }

    //Este método nos permite modificar el valor del radio.
    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Métodos (Comportamiento)
    //Todos los métodos tienen acceso a los atributos de la clase.
    public void calcularArea(){
        double area = Math.PI*pow(radio,2);
        System.out.printf("\n\t El área del círculo es: %.3f",area);
    }

    public void calcularPerimetro(){
        double perimetro=Math.PI*2*radio; //Diametro=2*radio
        System.out.printf("\n\t El perímetro círculo es: %.3f",perimetro);
    }

    public static void cuantosCirculos(){
        System.out.println("\n\t La cantidad de circulos: "+numCirculos);
    }

    @Override
    public String toString() {
        return "\n\t Circulo{" +
                "radio=" + radio +
                '}';
    }
}
