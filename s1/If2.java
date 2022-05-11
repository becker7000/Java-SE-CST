public class If2 {
    //Este programa simula el comportamiento de un moneda.

    public static void main(String[] args) {

        /*
        * El método Math.random() nos devuelve un número
        * entre 0 y 1 pero nunca 1.
        * */
        int moneda=(int)(Math.random()*2);

        if(moneda==0)
            System.out.println("\n\t "+MonedaTexto.SOL);
        else
            System.out.println("\n\t "+MonedaTexto.AGUILA);

    }

}
