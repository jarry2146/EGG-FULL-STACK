package Entidad;

public class Guante {
    private double energia;
    private boolean volando;
    private boolean disparando;

    public Guante() {
        energia = 100;
        volando = false;
        disparando = false;
    }

    public double usar_guante(int nivel_intensidad, int tiempo) {
        double energia_consumida = nivel_intensidad * tiempo;

        if (energia_consumida > energia) {
            energia_consumida = energia;
        }

        energia -= energia_consumida;

        if (nivel_intensidad > 5 && tiempo > 10) {
            volando = true;
            // Acciones para comenzar a volar
        } else if (nivel_intensidad > 2) {
            disparando = true;
            // Acciones para disparar
        }

        return energia_consumida;
    }

    public double obtenerEnergia() {
        return energia;
    }

    public boolean estaVolando() {
        return volando;
    }

    public boolean estaDisparando() {
        return disparando;
    }
}
    

