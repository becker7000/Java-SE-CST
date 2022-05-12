public class WhileAnidado {

    public static void main(String[] args) {

        int i=1,j; //Variable de control

        while(i<=10){ //Condición
            System.out.println("\n");
            j=1;
            while(j<=10){
                System.out.printf("\n\t %d * %d = %d",i,j,(i*j));
                j++;
            }
            i++; //Incremento
        }

    }

}
