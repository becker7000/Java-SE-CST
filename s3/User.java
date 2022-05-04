public abstract class User {

    /*
    * Las clases abstractas son clases que nunca se van a instanciar
    * solo sirven con una plantilla que se va a heredar a otras clases
    * hijas.
    * */

    public static int id;
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        User.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\n\tUser{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    //Método abstracto
    //Estos métodos no llevan un bloque de código,
    //ya que se van a definir en las clases hijas.

    public abstract void showDataUser();

}


