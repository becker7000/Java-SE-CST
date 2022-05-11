public class Variables {

    public static void main(String[] args) {

        //Java es un lenguaje fuertemente tipado.
        //int var_uno=10; //Asignamos el valor de 10 a x.

        /*
        * Existe algunos estilos para nombrar variables.
        *
        * snake case: var_uno
        * camell case: varUno
        *
        * */

        //Entradas:
        int a=10;
        int b=20;
        int c=5;

        //Proceso:
        a=a+3; // a=13
        b=b+4-a; //b=20+4-13=24-13=11
        c=a+b+c; //c=13+11+5=29
        a=a+c; //a=13+29=42
        b=4;  //b=4
        c=c+3-b+2; //c=29+3-4+2=30

        //Salidas:
        //Nota: el signo de + sirve para concatenar dentro de println.
        System.out.println("\n\t a = "+a+" b = "+b+" y c = "+c);
    }

}
