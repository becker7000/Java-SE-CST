import java.util.ArrayList;

public class TestPrecio {

    public static void main(String[] args) {

        Libro l1 = new Libro("Alimenta la mente","Lewis Carroll",100);
        Libro l2 = new Libro("El negociador","Arturo",150);
        Libro l3 = new Libro("Padre rico,padre pobre","Robert Kiyosaky",200);

        Producto p1 = new Producto("1234p","Refresco",25.8);
        Producto p2 = new Producto("1254p","Papas",15.8);
        Producto p3 = new Producto("1287p","Chocolates",45.8);

        IPrecio ip1=p1;
        IPrecio ip2=p2;
        IPrecio ip3=p3;
        IPrecio ip4=l1;
        IPrecio ip5=l2;
        IPrecio ip6=l3;

        //Lista de prec ios
        ArrayList<IPrecio> precios = new ArrayList<>();

        precios.add(ip1);
        precios.add(ip2);
        precios.add(ip3);
        precios.add(ip4);
        precios.add(ip5);
        precios.add(ip6);

        double total=0;
        for (IPrecio precio : precios) {
            total+=precio.getPrecio();
        }

        System.out.println("\n\t El total a pagar es: "+total);

    }

}
