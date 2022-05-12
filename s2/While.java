public class While {
    /*
    * Usamos while cuando sabemos exactamente en que momento
    * ya no se cumple la condición de repetición pero no exactamente el
    * número de veces que se va iterar un bloque de código.
    *
    * En cambio usamos el ciclo for cuando sí sabemos exactamente el
    * número de veces que vamos a iterar un bloque de código.
    * */

    public static void main(String[] args) {

        int i=1; //Variable de control

        while(i<=10){ //Condición
            System.out.printf("\n\t %d * 7 = %d",i,(i*7));
            i++; //Incremento
        }


    }

}
