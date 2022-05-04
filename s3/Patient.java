
public class Patient extends User {

    //Atributos:
    private double weight;
    private double height;

    //Constructor:
    public Patient(String name, String email, double weight, double height) {
        super(name, email);
        this.weight = weight;
        this.height = height;
    }

    @Override
    public void showDataUser() {
        System.out.println("\n\t Nombre: "+getName()+
                "\n\t Peso: "+weight+"\n\tAltura: "+height);
    }

}
