
package entida;


public class Circunferencia {
   
     private double radio;
     public double area;
     public double perimetro;
     public double PI=3.1416;
    
    
     public Circunferencia(){
         
     }

    public Circunferencia(double radio, double area, double perimetro,double PI) {
        this.radio = radio;
        this.area = area;
        this.perimetro = perimetro;
        this.PI=PI;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

   
    public double getRadio() {
        return radio;
    }

    

   
    }
    


