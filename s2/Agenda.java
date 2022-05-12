import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
//Nota: los archivos .JAR (Java Archive) nos ayudan a distribuir nuestro código).

public class Agenda {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Contacto> contactos = new ArrayList<>();

        int opcion=0;
        int idGlobal=1;

        while (opcion!=5){

            //Iniciando un proceso en windows
            try{
                ProcessBuilder processBuilder = new ProcessBuilder("cmd","/c","cls");
                try {
                    Process iniciarProceso = processBuilder.inheritIO().start();
                    iniciarProceso.waitFor();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }catch (Exception e){
                e.printStackTrace();
            }

            //Menú
            System.out.println("\n\t +++++++Agenda de contactos.++++++++++");
            System.out.print("\n\t Selecciona una opcion: ");
            System.out.print("\n\t 1) Agregar un contacto ");
            System.out.print("\n\t 2) Ver contactos ");
            System.out.print("\n\t 3) Modificar contacto ");
            System.out.print("\n\t 4) Eliminar contacto ");
            System.out.print("\n\t 5) Salir de la agenda ");
            System.out.print("\n\t Opcion => ");
            opcion= scanner.nextInt(); scanner.nextLine();

            //Variables auxiliares:
            String nombre="";
            String telefono="";
            int idContacto=0;
            boolean banderilla=false;

            switch (opcion){
                case 1 -> {
                    System.out.print("\n\t Nombre: ");
                    nombre=scanner.nextLine();
                    System.out.print("\n\t Telefono: ");
                    telefono= scanner.nextLine();
                    Contacto contacto = new Contacto(idGlobal,nombre,telefono);
                    idGlobal++;
                    contactos.add(contacto);
                    System.out.println("\n\t Contacto guardado.");
                    contacto.mostrarContacto();
                }
                case 2 -> {
                    System.out.println("\n\t Contactos en la agenda.");
                    if(contactos.isEmpty()){
                        System.out.print("\n\t Agenda vacía.");
                    }else{
                        for (Contacto c : contactos)
                            c.mostrarContacto();
                    }
                }
                case 3 -> { //Modificar contacto
                    System.out.print("\n\t Dame el ID: ");
                    idContacto = scanner.nextInt(); scanner.nextLine();
                    System.out.println();

                    for (Contacto c : contactos) {
                        if(idContacto==c.getId()){
                            System.out.print("\n\t Contacto encontrado.");
                            c.mostrarContacto(); // Primero lo mostramos

                            System.out.print("\n\t Nombre: ");
                            nombre=scanner.nextLine();
                            System.out.print("\n\t Telefono: ");
                            telefono= scanner.nextLine();

                            //Los setters nos ayudan a cambiar valores de los atributos.
                            c.setNombre(nombre);
                            c.setTelefono(telefono);
                            System.out.print("\n\t Contacto modificado.");
                            c.mostrarContacto(); //Lo volvemos a mostrar

                            banderilla=true;
                            break;
                        }
                    }
                    if(!banderilla)
                        System.out.println("\n\t El contacto no existe en la agenda.");
                }
                case 4 -> {
                    System.out.print("\n\t Dame el ID: ");
                    idContacto = scanner.nextInt(); scanner.nextLine();

                    for (Contacto c : contactos) {
                        if(idContacto==c.getId()){
                            System.out.print("\n\t Contacto encontrado.");
                            c.mostrarContacto();
                            contactos.remove(c);
                            System.out.print("\n\t Contacto eliminado.");
                            banderilla=true; //Significa que sí se encontro
                            break;
                        }
                    }

                    if(!banderilla)
                        System.out.print("\n\t El contacto no existe en la agenda.");
                }
                case 5 -> {
                    System.out.println("\n\t Nos vemos pronto.");
                }
            }

            System.out.println("\n\t Pulsa [ENTER] para continuar...");
            scanner.nextLine();
        }

        scanner.close();
    }

}
