package libreria2;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria2.Servicios.AutorServicio;
import libreria2.Servicios.EditorialServicio;
import libreria2.Servicios.LibroServicio;

public class Libreria2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("libreria2PU");
        EntityManager em = emf.createEntityManager();

        LibroServicio usuario1 = new LibroServicio();
        AutorServicio a1 = new AutorServicio();
        EditorialServicio e1 = new EditorialServicio();
        boolean con = false;
        do {
            System.out.println("________________MENU PRINCIPAL________________\n"
                    + "1 Menu libro\n"
                    + "2 Menu autor\n"
                    + "3 Menu editorial\n"
                    + "4 salir"
                    + "____________________________________");
            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                    usuario1.menu1();
                    break;
                case 2:
                    a1.menu2();
                    break;
                case 3:
                    e1.menu3();
                    break;
                case 4:
                    System.out.println("A salido del sistema: ");
                    con = true;
                    break;
                default:
                    System.out.println("Opcion incorecta intente de nueno: ");

            }
        } while (con==false);

    }

}
