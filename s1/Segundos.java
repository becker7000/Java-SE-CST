public class Segundos {

    public static void main(String[] args) {

        int segundosEnt=500;
        int minutos=segundosEnt/60; // 500/60 = 480
        int segundos=segundosEnt%60; // 500%60 = 20

        System.out.printf("\n\t Los segundos de entrada son: %d " +
                "\n\t Que son equivalentes a %d minutos con %d segundos.",segundosEnt,minutos,segundos);

        System.out.printf("\n\t Los segundo es hexadecimal son: %x",segundosEnt);

    }

}
