import static java.lang.Math.pow;

public class Circulo {

    //Atributos o variables de campo:
    private String color;
    private double radio;

    //Constructor es un método que me permite producir e iniciar.
    public Circulo(String color, double radio) {
        this.color = color;
        this.radio = radio;
    }

    // Los setters nos ayudan a ajustar valores de los atributos. (Sólo escritura)
    // Los getters nos ayudan a visualizar los valores de los atributos. (Sólo lectura)

    public String getColor() { //Nos muestra el color
        return color;
    }

    public void setColor(String color) { //Reajusta el color
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Comportamiendo (métodos):
    //Todos los métodos de una clase tienen acceso a sus atributos.
    void calcularArea(){
        double area=Math.PI*pow(radio,2);
        System.out.printf("\n\t El circulo de color %s tiene un área: %.2f",color,area);
    }

    void calcularPerimetro(){ // perimetro = pi * diametro
        double perimetro=Math.PI*radio*2;
        System.out.printf("\n\t El circulo de color %s tiene un perimetro: %.2f",color,perimetro);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "color='" + color + '\'' +
                ", radio=" + radio +
                '}';
    }
}
