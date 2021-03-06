import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {

    String titulo;
    JPanel panel;
    JTextField textField;
    // JLabel son de una sola linea.
    JTextArea reporte; // Es de muchas lineas
    Double consumo;

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

        //Método para agregar componentes a la ventada:
        iniciarComponentes();

        //Controlador de operación que se hace al cerrar la ventana.
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarCajasTexto();
        colocarBotones();
    }

    public void colocarPaneles(){

        panel=new JPanel();

        //Existe un diseño que Java pone por defecto a las ventanas.
        panel.setLayout(null); //Esto nos permite desactivar el diseño por defecto.

        //Método que nos ayuda a agregar contenido a la Ventana.
        this.getContentPane().add(panel);

        //Color de fondo del panel
        //panel.setBackground(Color.BLUE);

    }

    public void colocarEtiquetas(){

        //Creamos una etiqueta con un mensaje:
        JLabel etiqueta = new JLabel();

        //Ajustar permisos de diseño.
        etiqueta.setOpaque(true);

        //Ajustamos el texto que contendrá el JLabel
        etiqueta.setText(" Recibo CFE, consumo de electricidad");

        //Ajustamos el texto que tendra el JLabel
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);

        //Ajustamos el tamaño de la etiqueta
        etiqueta.setSize(350,20);

        //Modificar el color de la letra.
        etiqueta.setForeground(Color.BLUE);

        //Creamos una fuente
        Font font = new Font("Arial",Font.BOLD,18);

        //Ajustamos el estilo de la fuente del JLabel
        etiqueta.setFont(font);

        // Nota: tambien las JLabel tiene el método setBounds(10,10,ancho,alto)

        //Agregamos la etiqueta al panel.
        panel.add(etiqueta);

        //-----AGREGANDO UNA IMAGEN AL PANEL DE LA VENTANA
        ImageIcon cfe = new ImageIcon("C:\\Users\\Erick\\Documents\\Curso Java CST\\Codes\\s3/cfe.png");
        JLabel imagen = new JLabel();
        imagen.setBounds(50,40,200,72);
        imagen.setIcon(new ImageIcon(cfe.getImage().getScaledInstance(imagen.getWidth(),imagen.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(imagen);

    }

    public void colocarCajasTexto(){
        textField = new JTextField();
        textField.setBounds(50,120,200,50);
        panel.add(textField);
    }

    public void colocarBotones(){

        //Configuración del botón:
        JButton boton = new JButton("Calcular");
        boton.setBounds(50,200,200,50);

        //boton.setEnabled(false);

        //Ajustamos el color del texto del boton
        boton.setForeground(Color.BLUE);

        //Creamos una fuente
        Font font = new Font("Arial",Font.BOLD,14);

        //Ajustamos el estilo de la fuente del JLabel
        boton.setFont(font);

        //Agregamos el boton al panel.
        panel.add(boton);

        //---CREAMOS UN ÁREA DE TEXTO PARA GENERAR UN REPORTE---
        reporte = new JTextArea();
        reporte.setBounds(50,270,300,100);
        reporte.setForeground(Color.DARK_GRAY);

        //Creamos una fuente
        Font font2 = new Font("Arial",Font.PLAIN,12);

        //Agregamos la fuente a área de texto
        reporte.setFont(font2);

        //Agregamos el área de texto al panel.
        panel.add(reporte);

        //LÓGICA DEL BÓTON Y FUNCIONAMIENTO POR MEDIO DE UN EVENTO:

        ActionListener click = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Así guardamos como double el texto escrito en el input de textField.
                consumo=Double.parseDouble(textField.getText());
                //Creamos un objeto reporteCFE de clase ReciboCFE
                ReciboCFE reporteCFE = new ReciboCFE(consumo);
                //Ajustamos el texto de JTextArea report
                //usando el método generarReporte().
                reporte.setText(reporteCFE.generarReporte());
            }
        }; //Nota: cuando definimos la sobreescritura de un método usamos ;

        //Le agrega el eveto click a el botón.
        boton.addActionListener(click);

    }

}


/*
*
*   Ejercicio final: hacer una clase ReporteIMC.
*
*   Pedir dos datos con JTextField (peso, altura)
*
*   y acontinuación imprimir un reporte de su indice de masa corporal del usuario.
*
* */
