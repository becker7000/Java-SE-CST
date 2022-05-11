public class OperadoresIncremento {

    public static void main(String[] args) {

        int x=10;

        // x = 10
        System.out.printf("\n\t x = %d",x++);
        //x = 11
        System.out.printf("\n\t x = %d",x);

        /*
        * Nota: los operadores de incremento tiene la propiedad de
        *   modificar su jerarquía (precedencia).
        *   Por la izquierda tendrán mayor jerarquía que por la derecha.
        * */
    }

}
