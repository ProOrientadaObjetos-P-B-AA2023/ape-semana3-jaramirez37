package dispositivoelectronico;

/**
 *
 * @author joseph
 */
public class DispositivoElectronico {

    private String sistemaOperativo;
    private double tamanoPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private String dicIMEI;

    public DispositivoElectronico() {
    }

    public DispositivoElectronico(String sistemaOperativo,
            double tamanoPantalla,
            double costoInicial,
            double ivaPorcentaje,
            String direccionMac,
            String dicIMEI) {
        this.sistemaOperativo = sistemaOperativo;
        this.tamanoPantalla = tamanoPantalla;
        this.costoInicial = costoInicial;
        this.ivaPorcentaje = ivaPorcentaje;
        this.direccionMac = direccionMac;
        this.dicIMEI = dicIMEI;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public void setCostoInicial(double costoInicial) {
        this.costoInicial = costoInicial;
    }

    public void setIvaPorcentaje(double ivaPorcentaje) {
        this.ivaPorcentaje = ivaPorcentaje;
    }

    public void CalcularIvaCostoInicial() {
        this.ivaCostoInicial = this.ivaPorcentaje * this.costoInicial;
    }

    public void CalcularCostoFinal() {
        this.costoFinal = this.costoInicial + this.ivaCostoInicial;
    }

    public void setDireccionMac(String direccionMac) {
        this.direccionMac = direccionMac;
    }

    public void setDicIMEI(String dicIMEI) {
        this.dicIMEI = dicIMEI;
    }

    public String getSistemaOperativo() {
        return this.sistemaOperativo;
    }

    public double getTamanoPantalla() {
        return this.tamanoPantalla;
    }

    public double getCostoInicial() {
        return this.costoInicial;
    }

    public double getIvaPorcentaje() {
        return this.ivaPorcentaje;
    }

    public double getIvaCostoInial() {
        return this.ivaCostoInicial;
    }

    public double getCostoFinal() {
        return this.costoFinal;
    }

    public String getDireccionesMac() {
        return this.direccionMac;
    }

    public String getDicIMEI() {
        return this.dicIMEI;
    }

    @Override

    public String toString() {
        String msj = String.format("Equipo Celular"
                + "\nSistema Operativo: %s"
                + "\nTamano de la Pantalla: %.2f"
                + "\nCosto Inical: %.2f"
                + "\nIva Porcentaje: %.2f"
                + "\nIva Costo Inical: %.2f"
                + "\nCosto Final: %.2f"
                + "\nDireccion MAC: %s"
                + "\nIMEI: %s",
                this.getSistemaOperativo(),
                this.getTamanoPantalla(),
                this.getCostoInicial(),
                this.getIvaPorcentaje(),
                this.getIvaCostoInial(),
                this.getCostoFinal(),
                this.getDireccionesMac(),
                this.getDicIMEI());
        return msj;
    }
}

class Ejecutor {

    public static void main(String[] args) {
        DispositivoElectronico celular1 = new DispositivoElectronico("Android",
        6.78, 1200, 0.12,
                "00:1B:44:11:3A:B7", "010928/00/389023/3");
        celular1.CalcularIvaCostoInicial();
        celular1.CalcularCostoFinal();
        DispositivoElectronico celular2 = new DispositivoElectronico();
        System.out.println(celular1);
    }
}
