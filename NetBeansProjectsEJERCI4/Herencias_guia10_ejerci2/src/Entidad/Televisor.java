package Entidad;

public class Televisor extends Eletrodomestico {
 private double resolusion_Pulgadas;
    private boolean sintonizador_TDT;

    public Televisor() {
        super();
    }

    public Televisor(double resolusion_Pulgadas, boolean sintonizador_TDT, double precio, String color, char consumoEnergetico, double A, double B, double C, double D, double E, double F, double peso) {
        super(precio, color, consumoEnergetico, A, B, C, D, E, F, peso);
        this.resolusion_Pulgadas = resolusion_Pulgadas;
        this.sintonizador_TDT = sintonizador_TDT;
    }
    

    

    public double getResolusion_Pulgadas() {
        return resolusion_Pulgadas;
    }

    public void setResolusion_Pulgadas(double resolusion_Pulgadas) {
        this.resolusion_Pulgadas = resolusion_Pulgadas;
    }

    public boolean isSintonizador_TDT() {
        return sintonizador_TDT;
    }

    public void setSintonizador_TDT(boolean sintonizador_TDT) {
        this.sintonizador_TDT = sintonizador_TDT;
    }

    public void crearTelevisor(){
         super.crearElectrodomestico();
        System.out.println("Crear televisor: ");
       
        System.out.println("ingrese resolusion: ");
        resolusion_Pulgadas=leer.nextDouble();
        System.out.println("ingrese resolusion: ");
        sintonizador_TDT =leer.nextBoolean();
    }

    @Override
    public double precioFinal() {
       double precioFinal = super.precioFinal();
    if (resolusion_Pulgadas > 40) {
      precioFinal += precioFinal * 0.3;
    }
    if (sintonizador_TDT) {
      precioFinal += 500;
    }
    return precioFinal;
  }

    @Override
    public String toString() {
        return "Televisor{" + " precio = " + getPrecio() + " color = "+ getColor()+
                " consumoEnergetico = "+ getConsumoEnergetico()+
                " peso= "+getPeso()+" resolusion_Pulgadas = " + resolusion_Pulgadas + 
                ", sintonizador_TDT = " + sintonizador_TDT + '}';
    }
    
   
}
