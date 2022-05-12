public class Paciente extends Usuario{

    String telefono;

    public Paciente(String nombre, String email,String telefono) {
        super(nombre, email);
        this.telefono=telefono;
    }

    @Override
    public void mostrarDatosUsuario() {
        System.out.printf("\n\t Nombre: %s" +
                "\n\t Correo: %s" +
                "\n\t Telefono: %s",nombre,email,telefono);
    }
}
