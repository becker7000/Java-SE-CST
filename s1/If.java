public class If {

    public static void main(String[] args) {

        double radio=29.4f;

        //Cuando tenemos sólo una sentencia dentro del if,
        //no se requieren llaves, pero para más de una ya se usan las llaves.
        if(radio>0){
            System.out.println("Radio correcto!");
            System.out.println("Radio positivo!");
        }
        //La sentencia dentro de if se ejecuta si y solo si
        //devuelve un valor booleano true.
        System.out.println(radio>0);

    }

}

/*
*  Declara una varible de tipo entera,
*  luego aplicar la siguiente operacion,
*  x*2-3+x;
*  y que nos diga el programa si el resultado de
*  aplicar los calculos es par.
*
* */
