public class TestComprobacion {

    public static void main(String[] args) {

        int a=5;
        int b=18;
        int c=15;
        int d=25;

        a=a+10;
        b=b+5-c;
        c=c+4+b;
        d=d+b+a;
        a=a+1;
        b=b+c;
        c=b+c;
        d=b+b;

        System.out.printf("\n\t a = %d, b = %d, c = %d y d = %d",a,b,c,d);

    }

}
