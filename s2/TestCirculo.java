public class TestCirculo {

    public static void main(String[] args) {
        //Para probar el comportamiento de todas clase debemos
        //usarlas dentro de un punto de ejecución.

        //Usando el contructor de Circulo

        Circulo circulo1 = new Circulo("Rojo",5.2);
        Circulo circulo2 = new Circulo("Amarillo",6.1);
        Circulo circulo3 = new Circulo("Verde",7.4);

        circulo1.calcularArea();
        circulo1.calcularPerimetro();

        circulo2.calcularPerimetro();
        circulo3.calcularArea();

        //Mandamos a la consola a imprimir un circulo.
        System.out.println("\n\t"+circulo1);

    }

}
