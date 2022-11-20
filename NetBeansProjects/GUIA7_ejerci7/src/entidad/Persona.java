package entidad;

public class Persona {

    private String nombre;
    private int edad;
    private String sexo;
    private int peso;
    private float altura;
    private float imc;
    private boolean mym;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, int peso, float altura,float imc,boolean mym) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
         this.imc =imc;
         this.mym=mym;
    }  
   

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public void setMym(boolean mym) {
        this.mym = mym;
    }
    

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public int getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public float getImc() {
        return imc;
    }

    public boolean isMym() {
        return mym;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad +
                ", sexo=" + sexo + ", peso=" + peso + ", altura=" 
                + altura + ", imc=" + imc + ", mym=" + mym + '}';
    }

}
