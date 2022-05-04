public class Recibo {

    private int consumo; //kWh
    final double t1=1.2f;
    final double t2=1.5f;
    final double t3=1.7f;

    /*
    *   Si el c <800 -> t1
    *   Si el 800 >= c <= 1400 -> t2
    *   Si el c > 1400
    * */

    public Recibo(int consumo) {
        this.consumo = consumo;
    }

    public void generarReporte(){
        double tarifa=0;

        //Asignando la tarifa de acuerdo a su consumo:
        if(consumo<800)
            tarifa=t1;
        else if(consumo>=800 && consumo<=1400)
            tarifa=t2;
        else
            tarifa=t3;

        double monto=tarifa*consumo;

        StringBuilder reporte = new StringBuilder();
        String auxilar="";
        reporte.append("\n\t +------------------------+ ");
        reporte.append("\n\t | Reporte de consumo: ");
        auxilar=String.format("\n\t | Consumo: \t $%.2f",(double)consumo);
        reporte.append(auxilar);
        auxilar=String.format("\n\t | Tarifa: \t $%.2f",tarifa);
        reporte.append(auxilar);
        auxilar=String.format("\n\t | Monto: \t $%.2f",monto);
        reporte.append(auxilar);
        reporte.append("\n\t +------------------------+");

        System.out.println(reporte);

    }



}
