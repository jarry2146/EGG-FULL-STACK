
package entidad;


public class Paises {
    
    private String paises;

    public Paises() {
    }

    public Paises(String paises) {
        this.paises = paises;
    }

    public String getPaises() {
        return paises;
    }

    public void setPaises(String paises) {
        this.paises = paises;
    }

    @Override
    public String toString() {
        return "Paises{" + "paises=" + paises + '}';
    }
    
    
    
}
