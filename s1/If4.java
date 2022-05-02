public class If4 {

    public static void main(String[] args) {

        double num = 7.23;
        int parteEnt;
        //Casting de double a entero
        parteEnt = (int)num;

        double parteDecimal=num-parteEnt;
        if (parteDecimal>=0.5)
            System.out.println("\n\t La parte decimal es mayor o igual a 0.5");
        else
            System.out.println("\n\t La parte decimal es menor a 0.5");

    }

}
