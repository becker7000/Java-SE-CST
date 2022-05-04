import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Persona> contactos = new ArrayList<>();

        int opcion=0;
        int idGlobal=1;

        while (opcion!=5){ //5. Salir

            try{               //cmd (simbolo del sistema), cls(clear scream)
                ProcessBuilder pb = new ProcessBuilder("cmd","/c","cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //Menú
            System.out.println("\n\t Selecciona una opción.");
            System.out.println("\n\t 1. Agregar un contacto.");
            System.out.println("\n\t 2. Ver contactos.");
            System.out.println("\n\t 3. Modificar contacto.");
            System.out.println("\n\t 4. Eliminar contacto.");
            System.out.println("\n\t 5. Salir.");

            System.out.print("\n\t Opción: ");
            opcion= entrada.nextInt(); entrada.nextLine();
            // 34

            switch (opcion){
                case 1:
                    String nombre;
                    String telefono;
                    System.out.print("\n\t Nombre: ");
                    nombre=entrada.nextLine();
                    System.out.print("\n\t Teléfono: ");
                    telefono= entrada.nextLine();
                    Persona persona = new Persona(idGlobal,nombre,telefono);
                    idGlobal++;
                    contactos.add(persona);
                    System.out.println("\n\t Contacto guardado.");
                    persona.mostrar();
                    break;
                case 2:
                    System.out.println("\n\t Contactos registrados...");
                    if(contactos.isEmpty())
                        System.out.println("\n\t Agenda vacía.");
                    else{
                        for (Persona p : contactos)
                            p.mostrar();
                    }
                    break;
                case 3:
                    System.out.print("\n\t Dame el ID: ");
                    int id_= entrada.nextInt(); entrada.nextLine();
                    for (Persona p:contactos) {
                        if(id_==p.getId()){
                            System.out.print("\n\t Usuario encontrado...");
                            p.mostrar();
                            String nombre_;
                            String telefono_;
                            System.out.print("\n\t Nombre: ");
                            nombre_=entrada.nextLine();
                            System.out.print("\n\t Teléfono: ");
                            telefono_= entrada.nextLine();
                            p.setNombre(nombre_);
                            p.setCorreo(telefono_);
                            System.out.println("\n\tContancto modificado...");
                            p.mostrar();
                        }
                    }
                    break;
                case 4:
                    System.out.print("\n\t Dame el ID del contacto: ");
                    int id__= entrada.nextInt(); entrada.nextLine();
                    boolean banderilla=false;
                    for (Persona p:contactos) {
                        if (id__==p.getId()){
                            System.out.println("\n\t Contacto encontrado...");
                            p.mostrar();
                            contactos.remove(p);
                            System.out.println("\n\t Contacto eliminado.");
                            banderilla=true;
                            break;
                        }
                    }
                    if(banderilla==false)
                        System.out.println("\n\t El contacto no existe.");
                    break;
                case 5:
                    System.out.println("\n\t Fin del programa...");
                    break;
                default:
                    System.out.println("\n\t Opción no valida.");
                    break;
            }
            System.out.println("Pulsa [ENTER] para continuar...");
            entrada.nextLine();
        }

        entrada.close();
    }

}
