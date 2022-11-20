package entidad;

public class Persona {

    private String nombre;
    private int edad;
    private int cedula;
    

    public Persona() {
       
    }

    public Persona(String nombre, int edad, int cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

 
    public String getNombre() {
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public int getCedula(){
        return cedula;
    }
   
//    @Override
//    public String toString() {
//        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", cedula=" + cedula + '}';
//    }
}

