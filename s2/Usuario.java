/*
* Las clase abstractas no se pueden instanciar
* sólo nos sirven para derivarlas (aplicarles herencia).
* */

public abstract class Usuario {

    //Protected me permite que los atributos sean reconocidos por las clase hijas.
    protected String nombre;
    protected String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    //Los métodos abstractos no llevan cuerpo
    //sólamente se crean para que implementen en las clases hijas.
    public abstract void mostrarDatosUsuario();

}
