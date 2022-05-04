public class Persona {

    //Atributos:
    private int id;
    private String nombre;
    private String telefono;

    //Constructor:
    public Persona(int id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    //Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return telefono;
    }

    public void setCorreo(String correo) {
        this.telefono = correo;
    }

    public void mostrar(){
        System.out.printf("\n\t <%d> [%s] -> (%s)",id,nombre,telefono);
    }

}
