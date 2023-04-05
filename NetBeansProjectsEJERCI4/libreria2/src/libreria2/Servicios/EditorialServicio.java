package libreria2.Servicios;

import java.util.Collection;
import java.util.Objects;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria2.Entidades.Editorial;

public class EditorialServicio {

    AutorServicio a1 = new AutorServicio();
    Editorial e1 = new Editorial();
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("libreria2PU");
    EntityManager em = emf.createEntityManager();
    Scanner leer = new Scanner(System.in);

    public void menu3() {
        boolean validar = false;
        do {
            System.out.println("Ingrese una opcion:\n"
                    + "1 Crear editorial:\n"
                    + "2 Atualizar editorial:\n"
                    + "3 Eliminar editorial:\n"
                    + "4 buscar editorial:\n"
                    + "5 listar editorial \n"
                    + "6 Menu principal:");
            int opc = leer.nextInt();
            switch (opc) {

                case 1:
                    this.crearEditorial();
                    break;
                case 2:
                    
                    this.actualizarEditorial();
                    break;
                case 3:
                    this.eliminarEditorial(e1);
                    break;
                case 4:
                    this.buscarEditorial(e1);
                    break;
                case 5:
                    this.listarEditorial();
                    break;
                case 6:
//                    System.out.println("Salio del sistema: ");
                    validar = true;
                    break;
                default:
                    System.out.println("ingrese una opcion valida: ");
            }
        } while (validar == false);

    }

    public void crearEditorial() {

        System.out.println("Ingrese el nombre del editorial: ");
        e1.setNombre(leer.next());
        e1.setAlta(true);
        em.getTransaction().begin();
        em.persist(e1);
        em.getTransaction().commit();
    }

    public void actualizarEditorial() {
        try {
            System.out.println("Ingrese el autor que se va atualizar");
            e1.setNombre(leer.next());
            em.getTransaction().begin();
            em.merge(e1);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("error");

        }
    }

    public void eliminarEditorial(Editorial id) {
        try {
            System.out.println("ingrse id a eliminar");
            e1.setId(leer.nextInt());
            Editorial a1 = em.find(Editorial.class, id);
            em.getTransaction().begin();
            em.remove(id);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error el nombre no fue elimino");
        }
    }

    public Editorial buscarEditorial(Editorial id) {
        try {
            System.out.println("Buscar autor por id: ");
            e1.setId(leer.nextInt());
            em.find(Editorial.class, id);
            em.getTransaction().begin();
            em.persist(e1);
            em.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error el utor no fue encontrado: ");
        }
        return e1;
    }

    //Consulta de todos los autores
    public void listarEditorial() {

        Collection<Editorial> autores = em.createQuery("SELECT a FROM Editorial a").getResultList();
        System.out.println("Lista de autores:");
        for (Editorial autor : autores) {
            System.out.print(autor.getId() + ") " + autor.getNombre() + " / Estado: ");
            if (Objects.equals(autor.isAlta(), Boolean.TRUE)) {
                System.out.println("Activo.");
            } else {
                System.out.println("No activo.");
            }
        }
    }
}
