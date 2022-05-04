public class TestHospital {

    public static void main(String[] args) {

        Doctor d1 = new Doctor("Eduardo","edu45@hospital.es","Homeopata");
        Doctor d2 = new Doctor("Laura","lau41@hospital.es","Dentista");
        Doctor d3 = new Doctor("Maria","mari452@hospital.es","Cardiologia");
        Doctor d4 = new Doctor("Pedro","pedro415@hospital.es","Homeopata");

        Patient p1 = new Patient("Juan","j78uq@hotmail.com",75.2,1.7);
        Patient p2 = new Patient("July","ju456q@hotmail.com",60.2,1.63);
        Patient p3 = new Patient("Ana","jana123q@hotmail.com",55.2,1.54);

        System.out.println("\n\tDoctores: ");
        d1.showDataUser(); //Método polimorfico
        System.out.println();
        d2.showDataUser();
        System.out.println();
        d3.showDataUser();
        System.out.println();

        System.out.println("\n\tPacientes: ");
        p1.showDataUser();
        System.out.println();
        p2.showDataUser();
        System.out.println();
        p3.showDataUser();
        System.out.println();

    }

}
