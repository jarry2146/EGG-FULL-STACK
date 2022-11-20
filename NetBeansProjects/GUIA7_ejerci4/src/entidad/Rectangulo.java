/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author USUARIO
 */
public class Rectangulo {
    private double base;
    private double altura;
    public double superficie;
    public double perimetro;
    public String dibujar;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura, double superficie, double perimetro, String dibujar) {
        this.base = base;
        this.altura = altura;
        this.superficie = superficie;
        this.perimetro = perimetro;
        this.dibujar = dibujar;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
}

