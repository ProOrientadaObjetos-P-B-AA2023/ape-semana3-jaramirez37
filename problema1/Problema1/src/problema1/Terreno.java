package problema1;

/**
 *
 * @author joseph
 */
public class Terreno {

    private double costoTerreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;

    public Terreno() {
    }

    public Terreno(double ancho,
            double largo,
            double valorMetroCuadrado) {
        this.ancho = ancho;
        this.largo = largo;
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setValorMetroCuadrado(double valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    public void CalcularArea() {
        this.area = this.ancho * this.largo;
    }

    public void CalcularCostoTerreno() {
        this.costoTerreno = this.area * this.valorMetroCuadrado;
    }

    public double getCostoTerreno() {
        return this.costoTerreno;
    }

    public double getAncho() {
        return this.ancho;
    }

    public double getLargo() {
        return this.largo;
    }

    public double getArea() {
        return this.area;
    }

    public double getValorMetroCuadrado() {
        return this.valorMetroCuadrado;
    }

    @Override
    public String toString() {
        String msj = String.format("DATOS DEL TERRENO "
                + "\nAncho del terreno: %.2f "
                + "\nLargo del terreno: %.2f "
                + "\nValor del metro cuadrado del terreno: %.2f "
                + "\nEl area del terreno: %.2f "
                + "\nEl costo del terreno: %.2f ",
                this.getAncho(), this.largo, 
                this.getValorMetroCuadrado(), this.getArea(),
                this.getCostoTerreno());
        return msj;
    }

}

class Ejecutor {

    public static void main(String[] args) {
        Terreno terreno1 = new Terreno(10, 2, 2);
        terreno1.CalcularArea();
        terreno1.CalcularCostoTerreno();
        Terreno terreno2 = new Terreno();
        System.out.println(terreno1);
    }
}
