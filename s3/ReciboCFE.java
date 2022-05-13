public class ReciboCFE {

    /*
    *  si el consumo < 800kWh <- t1=1.2
    *  si el 800<= consumo <= 1450kWh t2=1.5
    *  si el consuma>1450kWh t3=1.8
    * */

    //Variables:
    private double consumo;
    //Constantes: (final limita a que se puedan modificar)
    final double t1=1.2;
    final double t2=1.5;
    final double t3=1.8;

    //Constructor
    public ReciboCFE(double consumo) {
        this.consumo = consumo;
    }

    //Generamos un reporte con una sola variable.
    public void generarReporte(){

        double tarifa=0;

        //Asignando una tarifa de acuerdo a su consumo:
        if(consumo<800)
            tarifa=t1;
        else if(consumo>=800 && consumo<=1450)
            tarifa=t2;
        else
            tarifa=t3;

        double montoAPagar=tarifa*consumo;

        //Generando el reporte dentro de una sola variable:
        //StringBuilder pertenece a java.lang
        StringBuilder reporte = new StringBuilder();

        reporte.append("\n\t +-----------------------+");
        reporte.append("\n\t | ------REPORTE----------");
        reporte.append(String.format("\n\t | Consumo: %.2f kWh",consumo));
        reporte.append(String.format("\n\t | Tarifa: $%.2f por kWh",tarifa));
        reporte.append(String.format("\n\t | Monto: $%.2f ",montoAPagar));
        reporte.append("\n\t +-----------------------+");

        System.out.println(reporte);

    }



}
