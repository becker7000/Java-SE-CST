public class For2 {

    public static void main(String[] args) {

        //Factorial 4!=4*3*2*1=24
        int factorial=1; //Las multiplicaciones se inician en 1.
        int n=5; // 5! = 5*4*3*2*1 = 120

        for (int i = n; i >1 ; i--)
            factorial*=i;

        System.out.printf("\n\t %d! = %d",n,factorial);

    }

}
