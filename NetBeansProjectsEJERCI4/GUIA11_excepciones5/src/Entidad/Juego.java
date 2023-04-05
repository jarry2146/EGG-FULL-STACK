package Entidad;

public class Juego {
    private int numero;

    public Juego() {
    }

    public Juego(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Juego{" + "numero=" + numero + '}';
    }
    
    
    
}
