package entidad;

public class Cancion {
    private String titulo;
    private String autor;
    private String genero;
    private double duracion;

    public Cancion() {
    }

   
    

    public Cancion(String titulo, String autor, String genero, double duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    
    

    
    
}
