package Entidad;

public class Lavadora extends Eletrodomestico {

    private double carga;

    public Lavadora() {
        super();
    }

    public Lavadora(double carga, double precio, String color, char consumoEnergetico, double peso){
       
       this.carga=carga;
    }
    

    public Lavadora(double carga, double precio, String color, char consumoEnergetico, double A, double B, double C, double D, double E, double F, double peso) {
        super(precio, color, consumoEnergetico, A, B, C, D, E, F, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
     super.crearElectrodomestico();

        System.out.println("Crear lavadora: ");

        
        System.out.println("ingresar carga: ");
        carga = leer.nextDouble();
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (carga > 30) {
            precioFinal += 500;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Lavadora{" + " precio= " + getPrecio() + " color= "+ getColor()+
                " consumoEnergetico= "+ getConsumoEnergetico()+" peso= "+getPeso()+
                "  carga= " + carga + '}';
    }
     

}
