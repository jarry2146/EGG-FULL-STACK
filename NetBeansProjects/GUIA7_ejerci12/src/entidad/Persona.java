package entidad;

public class Persona {

    private String nombre;
    private int fecha;
    private int anio;
    private int mes;
    private int dia;

    public Persona() {
    }

    public Persona(String nombre, int fecha, int anio, int mes, int dia) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFecha() {
        return fecha;
    }

    public int getAnio() {
        return anio;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

}
