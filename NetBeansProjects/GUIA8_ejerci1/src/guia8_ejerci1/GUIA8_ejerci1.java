package guia8_ejerci1;

import Servicio.MascotaServicio;
import entidad.Mascota;
import java.util.ArrayList;
import java.util.Scanner;

public class GUIA8_ejerci1 {

    static ArrayList<Mascota> ListaMascota = new ArrayList();

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        MascotaServicio dog = new MascotaServicio();

    dog.menu();


    }
}