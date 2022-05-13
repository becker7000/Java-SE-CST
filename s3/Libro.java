public class Libro implements IPrecio {

    //Atributos
    private String titulo;
    private String autor;
    private double precio;

    //Métodos
    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    //Este campo será un requisito para un componente.
    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                '}';
    }
}
