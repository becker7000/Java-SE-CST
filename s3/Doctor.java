
public class Doctor extends User {

    //Atributos:
    private String speciality;

    //Constructor:
    public Doctor(String name, String email, String speciality) {
        super(name, email);
        this.speciality = speciality;
    }

    @Override
    public void showDataUser() {
        System.out.println("\n\t Nombre: "+getName()+
                            "\n\tEspecialidad: "+speciality);
    }

}
