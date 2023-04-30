package institucioneducativa;

/**
 *
 * @author joseph
 */
public class InstitucionEducativa {

    private String nombre;
    private String tipoInstitucion;
    private int numAlumnos;
    private int numDocentes;
    private int numSedes;
    private double gastosEstudiante;
    private double presupuesto;

    public InstitucionEducativa() {
    }

    public InstitucionEducativa(String nombre,
            String tipoInstitucion,
            int numAlumnos,
            int numDocentes,
            int numSedes,
            double gastosEstudiante) {
        this.nombre = nombre;
        this.tipoInstitucion = tipoInstitucion;
        this.numAlumnos = numAlumnos;
        this.numDocentes = numDocentes;
        this.numSedes = numSedes;
        this.gastosEstudiante = gastosEstudiante;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoInstitucion(String tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }

    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }

    public void setNumDocentes(int numDocentes) {
        this.numDocentes = numDocentes;
    }

    public void setNumSedes(int numSedes) {
        this.numSedes = numSedes;
    }

    public void setGastosEstudiante(double gastosEstudiante) {
        this.gastosEstudiante = gastosEstudiante;
    }

    public void CalcularPresupuesto() {
        this.presupuesto = this.numAlumnos * this.gastosEstudiante;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getTipoInstitucion() {
        return this.tipoInstitucion;
    }

    public int getNumAlumnos() {
        return this.numAlumnos;
    }

    public int getNumDocentes() {
        return this.numDocentes;
    }

    public int getNumSedes() {
        return this.numSedes;
    }

    public double getGastosEstudiantes() {
        return this.gastosEstudiante;
    }

    public double getPresupuesto() {
        return this.presupuesto;
    }

    @Override

    public String toString() {
        String msj = String.format("Institucion Educativa"
                + "\nNombre de la institucion: %s  "
                + "\nTipo de institucion: %s "
                + "\nNumero de Alumnos: %d "
                + "\nNumero de Docentes: %d "
                + "\nNumero de sedes: %d"
                + "\nGastos proyectado por estudiante: %.2f "
                + "\nPresupuesto: %.2f ",
                this.getNombre(),
                this.getTipoInstitucion(),
                this.getNumAlumnos(),
                this.getNumDocentes(),
                this.getNumSedes(),
                this.getGastosEstudiantes(),
                this.getPresupuesto());
        return msj;
    }

}

class Ejecutor {

    public static void main(String[] args) {

        InstitucionEducativa institucion1 = new InstitucionEducativa("San Francisco",
                "Publica",
                24,
                8,
                3,
                1200.37);
        institucion1.CalcularPresupuesto();
        InstitucionEducativa institucion2 = new InstitucionEducativa();
        System.out.println(institucion1);
    }
}
