//Esta clase tiene la responsabilidad de llevar adelante las
//funcionalidades necesarias para administrar autores (consulta, 
//creación, modificación y eliminación).
package libreria2.Servicios;

import java.util.Collection;
import java.util.Objects;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria2.Entidades.Autor;

public class AutorServicio {

    
    Autor a1 = new Autor();

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("libreria2PU");
    EntityManager em = emf.createEntityManager();
    Scanner leer = new Scanner(System.in);

    public void menu2() {

        boolean con = false;

        do {

            System.out.println("Eliga una opcion:");
            System.out.println("");
            System.out.println("1 Crear Autor :");
            System.out.println("2 Actualizar Autor:");
            System.out.println("3 Eliminar Autor:");
            System.out.println("4 Buscar Autor:");
            System.out.println("5 Listar Autor:");
            System.out.println("6 Menu principal:");

            int opc = leer.nextInt();

            switch (opc) {
                case 1:
                    this.crearAutor();
                    break;
                case 2:
                    this.actualizarAutor();
                    break;

                case 3:
                    this.eliminarAutor(a1);
                    break;
                case 4:
                    this.buscarAutor(a1);
                    break;
                case 5:
                    this.listarAutores();
                    break;
                case 6:

//                    System.out.println("A salido ");
                    con = true;
                    break;
                default:
                    System.out.println("Intenta de nuevo ");

            }
        } while (con == false);

    }

    public void crearAutor() {

        System.out.println("Ingrese el nombre del autor: ");
        a1.setNombre(leer.next());
        a1.setAlta(true);
        em.getTransaction().begin();
        em.persist(a1);
        em.getTransaction().commit();
    }

    public void actualizarAutor() {
        try {
            System.out.println("Ingrese el autor que se va atualizar");
            a1.setNombre(leer.next());
            em.getTransaction().begin();
            em.merge(a1);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("error");

        }
    }

    public void eliminarAutor(Autor id) {
        try {
            System.out.println("ingrse id a eliminar");
            a1.setId(leer.nextInt());
            Autor a1 = em.find(Autor.class, id);
            em.getTransaction().begin();
            em.remove(id);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error el nombre no fue elimino");
        }
    }

    public Autor buscarAutor(Autor id) {
        try {
            System.out.println("Buscar autor por id: ");
            a1.setId(leer.nextInt());
            em.find(Autor.class, id);
            em.getTransaction().begin();
            em.persist(a1);
            em.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error el utor no fue encontrado: ");
        }
        return a1;
    }

    //Consulta de todos los autores
    public void listarAutores() {

        Collection<Autor> autores = em.createQuery("SELECT a FROM Autor a").getResultList();
        System.out.println("Lista de autores:");
        for (Autor autor : autores) {
            System.out.print(autor.getId() + ") " + autor.getNombre() + " / Estado: ");
            if (Objects.equals(autor.isAlta(), Boolean.TRUE)) {
                System.out.println("Activo.");
            } else {
                System.out.println("No activo.");
            }
        }
    }
}
