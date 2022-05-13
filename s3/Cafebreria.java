import java.util.ArrayList;

public class Cafebreria {

    public static void main(String[] args) {

        Libro l1 = new Libro("Alimenta la mente","Lewis Carroll",120);
        Libro l2 = new Libro("El negociador","Arturo",220);
        Libro l3 = new Libro("Padre rico, padre pobre","Robert kiyosky",350);

        Producto p1 = new Producto("1a2s","Coca cola",28.5);
        Producto p2 = new Producto("1b2d","Sabritas",32.99);

        IPrecio il1=l1; //Delimitamos a libro 1 a sólo un método.
        IPrecio il2=l2;
        IPrecio il3=l3;
        IPrecio ip1=p1;
        IPrecio ip2=p2;

        //Generamos una lista de precios gracias a la interface IPrecio:
        ArrayList<IPrecio> precios = new ArrayList<>();

        precios.add(il1);
        precios.add(il2);
        precios.add(il3);
        precios.add(ip1);
        precios.add(ip2);

        double total=0;
        for ( IPrecio precio : precios ) {
            total+=precio.getPrecio();
        }

        System.out.println("\n\t El precio total es: "+total);

    }

}
