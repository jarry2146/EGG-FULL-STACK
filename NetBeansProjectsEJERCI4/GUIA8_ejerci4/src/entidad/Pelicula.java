package entidad;

import java.util.Comparator;

public class Pelicula {

    private String nombre;
    private String director;
    private Double duracionPeliculaH;
    

    public Pelicula() {
    }

    public Pelicula(String nombre, String director, Double duracionPeliculaH) {
        this.nombre = nombre;
        this.director = director;
        this.duracionPeliculaH = duracionPeliculaH;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracionPeliculaH() {
        return duracionPeliculaH;
    }

    public void setDuracionPeliculaH(Double duracionPeliculaH) {
        this.duracionPeliculaH = duracionPeliculaH;
    }
   
            

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", director=" + director + ", duracionPeliculaH=" + duracionPeliculaH + '}';
    }
     public static Comparator<Pelicula> compararDuracion=new Comparator<Pelicula>(){
           @Override 
            public int compare(Pelicula p1,Pelicula p2){
            return p1.getDuracionPeliculaH().compareTo(p2.getDuracionPeliculaH());
            }
            };

}
