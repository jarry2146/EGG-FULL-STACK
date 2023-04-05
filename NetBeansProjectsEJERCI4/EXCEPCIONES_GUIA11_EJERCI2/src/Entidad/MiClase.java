package Entidad;

public class MiClase {
   

    private int[] array;

    public MiClase(int tam) {
        this.array = new int[tam];
    }

    public void setValor(int indice, int valor) throws ArrayIndexOutOfBoundsException {
        if (indice < 0 || indice >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Índice fuera de rango");
        }
        array[indice] = valor;
    }

    public int getValor(int indice) throws ArrayIndexOutOfBoundsException {
        if (indice < 0 || indice >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Índice fuera de rango");
        }
        return array[indice];
    }

}


