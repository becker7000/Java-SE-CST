public class TestVentana {

    public static void main(String[] args) {

        Ventana ventana = new Ventana("Aquí va un título increíble",500,500);
        //Nota: En java todas las ventas por defecto son invisibles.
        //setVisible es un método que nos permite ajustar la visibilidad de la ventana.
        ventana.setVisible(true); //Así sí se mostrará la ventana.

    }

}
