public class Doctor extends Usuario {

    private String especialidad;

    public Doctor(String nombre, String email, String especialidad) {
        super(nombre, email); //super hacer referencia a la clase padre (Usuario)
        this.especialidad=especialidad;
    }

    @Override
    public void mostrarDatosUsuario() {
        System.out.printf("\n\t Nombre: %s" +
                "\n\t Correo: %s" +
                "\n\t Especialidad: %s",nombre,email,especialidad);
    }
}
