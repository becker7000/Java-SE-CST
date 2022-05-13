import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    String titulo;


    public Ventana(String titulo, int ancho, int altura) {

        this.titulo = titulo;

        //Ajustando el tamaño de la ventana.
        setSize(ancho,altura); //Sera en píxeles

        //Ajustamos el título
        setTitle(titulo);

        //Ajustamos el lugar en donde va a aparecer la ventana.
        //setLocation(60,60);

        //Existe una función que junta el método setSize con el método setLocation
        //setBounds(300,300,ancho,altura);

        //Ajustamos el tamaño mínimo de la ventana.
        setMinimumSize(new Dimension(450,450));

        //Ajustamos que la ventana aparezca en el centro de la pantalla.
        setLocationRelativeTo(null); //Valor nulo provoca que aparezca en el centro.

        //Ajustamos el color
        //this.getContentPane().setBackground(Color.BLUE);

        //Controlador de operación que se hace al cerrar la ventana.
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


}
