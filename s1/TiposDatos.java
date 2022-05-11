public class TiposDatos {

    public static void main(String[] args) {

        // 1 bit -> binary digit (0,1).
        // 1 byte -> 8 bits ( 10010111 ).

        //Coersión es una propiedad que nos permite cambiar el tipo de dato.
        //Implicita: en automatica
        //Explicita: es forzada
        int x=10;
        long t=x;
        float y=20.5f; //La f es un forzado para los float.
        double z=12.2;
        int z_entero=(int)z; //Casting (forzado de double a int)

        //Cadenas:
        String nombre="Erick";

        //Salidas de tipos de datos:

        //Salida concatenada:
        System.out.println("\n\t x = <"+x+">");
        //Salidas formateadas:
        System.out.printf("\n\t x = <%d>",x);
        //Códigos de formato para varios tipos de dato:
        // %d (int) , %f (float y double), %s (String), %c (char)

    }

}

/*
*  10 % 3 = 1
*  15 % 4 = 3
*  100 % 60 = 40
*  34 % 7 = 6
*
*  Ejemplo:
*   100 segundos -> 1 minuto con 40 segundos
*
*   4+5*2 =4+10=14
*
* */
