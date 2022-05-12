public class Automovil {

    private String marca;
    private String modelo;
    private String placas;

    public Automovil(String marca, String modelo, String placas) {
        this.marca = marca;
        this.modelo = modelo;
        this.placas = placas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public void mostrar(){
        System.out.printf("\n\t +---------------+" +
                          "\n\t | Marca: %s" +
                          "\n\t | Modelo: %s" +
                          "\n\t | Placas: %s" +
                          "\n\t +---------------+",marca,modelo,placas);
    }

}
