public class Dado {

    public static void main(String[] args) {

        //Generamos valores de 1 a 6.
        int dado=(int)(Math.random()*6+1);

        //Esta sintaxis de switch no requiere break...
        switch (dado){
            case 1 -> {
                System.out.println("\n\t "+DadoTexto.UNO);
            }
            case 2 -> {
                System.out.println("\n\t "+DadoTexto.DOS);
            }
            case 3 -> {
                System.out.println("\n\t "+DadoTexto.TRES);
            }
            case 4 -> {
                System.out.println("\n\t "+DadoTexto.CUATRO);
            }
            case 5 -> {
                System.out.println("\n\t "+DadoTexto.CINCO);
            }
            case 6 -> {
                System.out.println("\n\t "+DadoTexto.SEIS);
            }
        }
    }

}
