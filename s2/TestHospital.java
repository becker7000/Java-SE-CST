public class TestHospital {

    public static void main(String[] args) {

        Doctor d1 = new Doctor("Pepe","pp123we@gmail.com","Dentista");
        Doctor d2 = new Doctor("Laura","lau00we@gmail.com","Cardiologia");
        Paciente p1 = new Paciente("Jorge","jor0102@gmail.com","5512345678");
        Paciente p2 = new Paciente("Tania","tan5002@gmail.com","5598765432");

        //Polimorfismo

        d1.mostrarDatosUsuario();
        d2.mostrarDatosUsuario();

        p1.mostrarDatosUsuario();
        p2.mostrarDatosUsuario();

        /*
        * La POO tiene 4 pilares, los cuales son:
        *   1)Encapsulación 2)Abstración 3)Herencia 4)Polimorfismo
        * */
    }

}
