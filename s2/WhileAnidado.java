public class WhileAnidado {

    public static void main(String[] args) {

        int i=0; //Varibale global (linea 5 a 18)

        while (i<5){
            System.out.println();
            int j=0; // Variable local (lineas 9 a 14)
            while (j<=i){
                System.out.print(" *");
                j++;
            }
            i++;
        }

    //Reto: hacer un arbolito de navidad con asteriscos.
    }

}
