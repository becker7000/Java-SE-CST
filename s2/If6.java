public class If6 {
    //Este ejemplo simula el comportamiento de una moneda.
    public static void main(String[] args) {

        //Casting del double a entero.
        //Math.random() devuelve un valor entre 0 y 1.
        int moneda=(int) (Math.random()*2);

        //Declando una varibale de tipo MonedaTexto
        //Sus valores posibles se guardan en una enumeración.
        MonedaTexto lado;
        if(moneda==0){
            lado=MonedaTexto.SOL;
            System.out.println(lado);
        }
        else{
            lado=MonedaTexto.AGUILA;
            System.out.println(lado);
        }
    }
}
