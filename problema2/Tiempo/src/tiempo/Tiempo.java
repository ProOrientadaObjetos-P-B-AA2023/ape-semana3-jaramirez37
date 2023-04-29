package tiempo;

/**
 *
 * @author joseph
 */
public class Tiempo {

    private double horas;
    private double minutos;
    private double segundos;
    private double dias;

    public Tiempo() {
    }

    public Tiempo(double horas, double minutos,
                  double segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public void CalcularMinutos() {
        this.minutos = this.minutos * this.horas;
    }

    public void CalcularSegundos() {
        this.segundos = this.segundos * this.horas;
    }

    public void CalcularDias() {
        this.dias = this.horas / 24;
    }

    public double getHoras() {
        return this.horas;
    }

    public double getMinutos() {
        return this.minutos;
    }

    public double getSegundos() {
        return this.segundos;
    }

    public double getDias() {
        return this.dias;
    }

    @Override
    public String toString() {
        String msj = String.format("Equivalencia en horas"
                + "\nHoras: %.2f"
                + "\nHoras a minutos: %.2f "
                + "\nHoras a segundos: %.2f "
                + "\nHoras a dias: %.2f ",
                this.getHoras(),
                this.getMinutos(),
                this.getSegundos(),
                this.getDias());
        return msj;
    }

}

class Ejecutor {

    public static void main(String[] args) {
        Tiempo eq1 = new Tiempo(52,60,3600);
        eq1.CalcularMinutos();
        eq1.CalcularSegundos();
        eq1.CalcularDias();
        Tiempo eq2 = new Tiempo();
        System.out.println(eq1);
    }
}
