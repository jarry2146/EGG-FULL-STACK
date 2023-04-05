package Entidad;

public class Bota {
    private int nivel_intensidad;
    private int tiempo;
    private double energia_consumida;
    private double estado_bateria;

    public Bota() {
    }
     public Bota(int nivel_intensidad, int tiempo, double energia_consumida, double estado_bateria) {
        this.nivel_intensidad = nivel_intensidad;
        this.tiempo = tiempo;
        this.energia_consumida = energia_consumida;
        this.estado_bateria = estado_bateria;
    }

    public int getNivel_intensidad() {
        return nivel_intensidad;
    }

    public void setNivel_intensidad(int nivel_intensidad) {
        this.nivel_intensidad = nivel_intensidad;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public double getEnergia_consumida() {
        return energia_consumida;
    }

    public void setEnergia_consumida(double energia_consumida) {
        this.energia_consumida = energia_consumida;
    }

    public double getEstado_bateria() {
        return estado_bateria;
    }

    public void setEstado_bateria(double estado_bateria) {
        this.estado_bateria = estado_bateria;
    }
    public double usar_bota() {
        double energia_consumida = 0;
        if (nivel_intensidad >= 1 && nivel_intensidad <= 3) {
            energia_consumida = nivel_intensidad * tiempo * 0.5;
            estado_bateria -= energia_consumida;
        } else if (nivel_intensidad >= 4 && nivel_intensidad <= 6) {
            energia_consumida = nivel_intensidad * tiempo * 0.8;
            estado_bateria -= energia_consumida;
        } else if (nivel_intensidad >= 7 && nivel_intensidad <= 10) {
            energia_consumida = nivel_intensidad * tiempo * 1.2;
            estado_bateria -= energia_consumida;
        }
        return energia_consumida;
    } 
    
}
