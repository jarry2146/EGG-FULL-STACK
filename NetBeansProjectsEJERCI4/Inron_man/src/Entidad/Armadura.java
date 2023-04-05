package Entidad;

public class Armadura {
private String color_primario;
private String color_secundario;
private int propulsor_bota_izquierda;
private int propulsor_bota_derecha;
private int repulsor_izquierdo;
private int repulsor_derecho;
private int nivel_resistencia;
private int nivel_salud;// Nivel de salud de la armadura, en una escala de 0 a 100.
private int generador;
private int consola;
private int sintetizador;
private int consumo_bota;
private int consumo_guante;
private int consumo_consola;
private int consumo_sintetizador;

    public Armadura() {
    }

    public Armadura(String color_primario, String color_secundario, int propulsor_bota_izquierda, int propulsor_bota_derecha, int repulsor_izquierdo, int repulsor_derecho, int nivel_resistencia, int nivel_salud, int generador, int consola, int sintetizador, int consumo_bota, int consumo_guante, int consumo_consola, int consumo_sintetizador) {
        this.color_primario = color_primario;
        this.color_secundario = color_secundario;
        this.propulsor_bota_izquierda = propulsor_bota_izquierda;
        this.propulsor_bota_derecha = propulsor_bota_derecha;
        this.repulsor_izquierdo = repulsor_izquierdo;
        this.repulsor_derecho = repulsor_derecho;
        this.nivel_resistencia = nivel_resistencia;
        this.nivel_salud = nivel_salud;
        this.generador = generador;
        this.consola = consola;
        this.sintetizador = sintetizador;
        this.consumo_bota = consumo_bota;
        this.consumo_guante = consumo_guante;
        this.consumo_consola = consumo_consola;
        this.consumo_sintetizador = consumo_sintetizador;
    }

    public String getColor_primario() {
        return color_primario;
    }

    public void setColor_primario(String color_primario) {
        this.color_primario = color_primario;
    }

    public String getColor_secundario() {
        return color_secundario;
    }

    public void setColor_secundario(String color_secundario) {
        this.color_secundario = color_secundario;
    }

    public int getPropulsor_bota_izquierda() {
        return propulsor_bota_izquierda;
    }

    public void setPropulsor_bota_izquierda(int propulsor_bota_izquierda) {
        this.propulsor_bota_izquierda = propulsor_bota_izquierda;
    }

    public int getPropulsor_bota_derecha() {
        return propulsor_bota_derecha;
    }

    public void setPropulsor_bota_derecha(int propulsor_bota_derecha) {
        this.propulsor_bota_derecha = propulsor_bota_derecha;
    }

    public int getRepulsor_izquierdo() {
        return repulsor_izquierdo;
    }

    public void setRepulsor_izquierdo(int repulsor_izquierdo) {
        this.repulsor_izquierdo = repulsor_izquierdo;
    }

    public int getRepulsor_derecho() {
        return repulsor_derecho;
    }

    public void setRepulsor_derecho(int repulsor_derecho) {
        this.repulsor_derecho = repulsor_derecho;
    }

    public int getNivel_resistencia() {
        return nivel_resistencia;
    }

    public void setNivel_resistencia(int nivel_resistencia) {
        this.nivel_resistencia = nivel_resistencia;
    }

    public int getNivel_salud() {
        return nivel_salud;
    }

    public void setNivel_salud(int nivel_salud) {
        this.nivel_salud = nivel_salud;
    }

    public int getGenerador() {
        return generador;
    }

    public void setGenerador(int generador) {
        this.generador = generador;
    }

    public int getConsola() {
        return consola;
    }

    public void setConsola(int consola) {
        this.consola = consola;
    }

    public int getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(int sintetizador) {
        this.sintetizador = sintetizador;
    }

    public int getConsumo_bota() {
        return consumo_bota;
    }

    public void setConsumo_bota(int consumo_bota) {
        this.consumo_bota = consumo_bota;
    }

    public int getConsumo_guante() {
        return consumo_guante;
    }

    public void setConsumo_guante(int consumo_guante) {
        this.consumo_guante = consumo_guante;
    }

    public int getConsumo_consola() {
        return consumo_consola;
    }

    public void setConsumo_consola(int consumo_consola) {
        this.consumo_consola = consumo_consola;
    }

    public int getConsumo_sintetizador() {
        return consumo_sintetizador;
    }

    public void setConsumo_sintetizador(int consumo_sintetizador) {
        this.consumo_sintetizador = consumo_sintetizador;
    }

    @Override
    public String toString() {
        return "Armadura{" + "color_primario=" + color_primario + ", color_secundario=" + color_secundario + ", propulsor_bota_izquierda=" + propulsor_bota_izquierda + ", propulsor_bota_derecha=" + propulsor_bota_derecha + ", repulsor_izquierdo=" + repulsor_izquierdo + ", repulsor_derecho=" + repulsor_derecho + ", nivel_resistencia=" + nivel_resistencia + ", nivel_salud=" + nivel_salud + ", generador=" + generador + ", consola=" + consola + ", sintetizador=" + sintetizador + ", consumo_bota=" + consumo_bota + ", consumo_guante=" + consumo_guante + ", consumo_consola=" + consumo_consola + ", consumo_sintetizador=" + consumo_sintetizador + '}';
    }
    

}
