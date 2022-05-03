import java.util.ArrayList;

public class TestCirculo {

    public static void main(String[] args) {

        //Creando instancias de la clase Circulo
        Circulo c1 = new Circulo(2.4);
        Circulo c2 = new Circulo(5.4);
        Circulo c3 = new Circulo(1.4);
        Circulo c4 = new Circulo(0.4);

        ArrayList<Circulo> circulos = new ArrayList<>();
        circulos.add(c1);
        circulos.add(c2);
        circulos.add(c3);
        circulos.add(c4);

        /*
        * Este ciclo foreach recibe como parametros dos cosas,
        * 1) el nombre de la clase Circulo donde c será un objeto de esa clase
        *   c irá tomando los valores de cada elemento de la lista circulos.
        * */
        for (Circulo c : circulos) {
            System.out.println(c);
        }

        Circulo.cuantosCirculos();
        /*
        * Los métodos estáticos son métodos que no necesitan
        * crear una instancia de su clase para poderse usar.
        * */

    }

}
/*
*   La programación orientada a objetos tiene 4 pilares:
*   1) Encapsulamiento 2) Abstracción 3) Herencia 4) Polimorfismo
*
* */