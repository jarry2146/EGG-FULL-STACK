package Entidad;

import java.util.Scanner;

public class Eletrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private double precio;
    private String color;
    private char consumoEnergetico;
    private double A, B, C, D, E, F;
    private double peso;

    public Eletrodomestico() {
    }

    
    

    public Eletrodomestico(double precio, String color, char consumoEnergetico, double A, double B, double C, double D, double E, double F, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.E = E;
        this.F = F;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = B;
    }

    public double getC() {
        return C;
    }

    public void setC(double C) {
        this.C = C;
    }

    public double getD() {
        return D;
    }

    public void setD(double D) {
        this.D = D;
    }

    public double getE() {
        return E;
    }

    public void setE(double E) {
        this.E = E;
    }

    public double getF() {
        return F;
    }

    public void setF(char F) {
        this.F = F;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    //Metodos

    public char comprobarConsumoEnergetico(char consumoEnergetico) {
        if (consumoEnergetico >= 'A' && consumoEnergetico <= 'F') {
            return consumoEnergetico;
        } else {
            return consumoEnergetico;
        }

    }

    public String comprobarColor(String color) {
        String[] coloresValidos = {"blanco", "negro", "rojo", "azul", "gris"};
        for (String colorValido : coloresValidos) {
            if (colorValido.equals(color.toLowerCase())) {
                
            }
           
        }
         return color;
    }
 
    


    public void crearElectrodomestico() {
        Eletrodomestico e1 = new Eletrodomestico();
        System.out.println("ingrese los datos del eletrodomestico: ");
        System.out.println("Precio: ");
        e1.setPrecio(leer.nextInt());
        System.out.print("Ingrese el color (Blanco, Negro, Rojo, Azul, Gris): ");
        e1.setColor(leer.next());
        System.out.print("Ingrese el consumo energético (A, B, C, D, E, F): ");
        e1.setConsumoEnergetico(leer.next().charAt(0));
        System.out.println("Ingrese el peso: ");
        e1.setPeso(leer.nextInt());
        
//        this.comprobarConsumoEnergetico(consumoEnergetico);
//        this.comprobarColor(color);
//       precio = 1000;
    }

    public double precioFinal() {

        double precioFinal =0;
        switch (consumoEnergetico) {
            case 'A':
                precioFinal += 1000;

                break;

            case 'B':
                precioFinal += 800;

                break;

            case 'C':
                precioFinal += 600;

                break;

            case 'D':
                precioFinal += 500;

                break;
            case 'E':
                precioFinal += 300;

                break;

            case 'F':
                precioFinal += 100;

                break;

        }

        if (peso >= 1 && peso <= 19) {
            precioFinal += 100;

        } else if (peso >= 20 && peso <= 49) {
            precioFinal += 500;

        } else if (peso >= 50 && peso <= 79) {
            precioFinal += 800;

        } else if (peso >= 80) {
            precioFinal += 1000;
//            System.out.println("El precio final es:" + precioFinal);
        }
        return precioFinal+precio;

    }

    @Override
    public String toString() {
        return "Eletrodomestico{" + "leer=" + leer + ", precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", A=" + A + ", B=" + B + ", C=" + C + ", D=" + D + ", E=" + E + ", F=" + F + ", peso=" + peso + '}';
    }
    

}
