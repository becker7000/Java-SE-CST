public class Dado {

    public static void main(String[] args) {

        //Esta línea guarda número aleatorios entre 1 y 6
        // en la variable lado.
        int lado = (int)(Math.random()*6+1);

        DadoTexto ladoDado;

        switch (lado){
            case 1 -> {
                ladoDado = DadoTexto.UNO;
                System.out.println(ladoDado);
            }
            case 2 -> {
                ladoDado = DadoTexto.DOS;
                System.out.println(ladoDado);
            }
            case 3 -> {
                ladoDado = DadoTexto.TRES;
                System.out.println(ladoDado);
            }
            case 4 -> {
                ladoDado = DadoTexto.CUATRO;
                System.out.println(ladoDado);
            }
            case 5 -> {
                ladoDado = DadoTexto.CINCO;
                System.out.println(ladoDado);
            }
            case 6 -> {
                ladoDado = DadoTexto.SEIS;
                System.out.println(ladoDado);
            }
        }

    }

}
