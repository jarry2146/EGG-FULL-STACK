package libreria2.Servicios;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import static libreria2.Entidades.Autor_.nombre;
import libreria2.Entidades.Libro;
import static libreria2.Entidades.Libro_.isbn;
import static libreria2.Entidades.Libro_.titulo;

public class LibroServicio {

    EditorialServicio e1 = new EditorialServicio();
    AutorServicio a1 = new AutorServicio();
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("libreria2PU");
    EntityManager em = emf.createEntityManager();
    Libro L1 = new Libro();
    Scanner leer = new Scanner(System.in);

    public void menu1() {
        boolean validar = false;
        do {
            System.out.println("Ingrese una opcion \n"
                    + "1 Crear libro \n"
                    + "2 Buscar libro por nombre \n"
                    + "3 Buscar por isbn\n"
                    + "4 Buscar por titulo\n"
                    + "5 Buscar por nombre de autor\n"
                    + "6 Buscar por nombre de editorial\n"
                    + "7 Listar libro \n"
                    + "8 Atualizar \n"
                    + "9 Eliminar \n"
                    + "10 Menu principal: ");
            int opc = leer.nextInt();
            switch (opc) {

                case 1:
                    this.crearLiblro();
                    break;

                case 2:

                    this.buscarPorNombre();
                    break;
                case 3:
                    this.buscarPorIsbn();
                    break;
                case 4:

                    this.buscarPorTitulo();
                    break;
                case 5:

                    this.buscarNombreAutor();
                    break;
                case 6:

                    this.buscarNombreEditorial();
                    break;
                case 7:

                    this.listarLiblro();
                    break;
                case 8:

                    this.actualizarLiblro();
                    break;
                case 9:
                    this.eliminarLiblro(L1);
                    break;
                case 10:
                    validar = true;
                    break;
                default:
                    System.out.println("ingrese una opcion valida: ");
            }
        } while (validar == false);

    }

    public void crearLiblro() {

//        System.out.println("Ingrese id:");
//        L1.setId(leer.nextLong());
        System.out.println("Ingrese isbn: ");
        L1.setIsbn(leer.nextLong());
        L1.setTitulo(leer.nextLine());
        System.out.println("Ingrese el titulo: ");
        L1.setTitulo(leer.nextLine());
        System.out.println("Ingrese el anio: ");
        L1.setAnio(leer.nextInt());
        System.out.println("Ejemplares: ");
        L1.setEjemplares(leer.nextInt());
        System.out.println("ejemplares Prestados: ");
        L1.setEjemplaresPrestados(leer.nextInt());
        System.out.println("ejemplaresRestantes: ");
        L1.setEjemplaresRestantes(leer.nextInt());

        L1.setAlta(true);
        em.getTransaction().begin();
        em.persist(L1);
        em.getTransaction().commit();
    }

    public void cargarBase() {

        try {

            em.getTransaction().begin();
            em.persist(a1);
            em.getTransaction().commit();
            em.getTransaction().begin();
            em.persist(e1);
            em.getTransaction().commit();
            em.getTransaction().begin();
            em.persist(L1);
            em.getTransaction().commit();

        } catch (Exception e) {

            System.out.println("error");
        }
    }

    public List<Libro> buscarPorNombre() {
        TypedQuery<Libro> query = em.createQuery(
                "SELECT l FROM Libro l WHERE l.nombre = :nombre",
                Libro.class);
        query.setParameter("nombre", nombre);
        return query.getResultList();

    }

    public Libro buscarPorIsbn() {
        TypedQuery<Libro> query = em.createQuery(
                "SELECT l FROM Libro l WHERE l.titulo = :titulo",
                Libro.class);
        query.setParameter("isbn", isbn);

        return (Libro) query.getResultList();
    }

    public List<Libro> buscarPorTitulo() {
        TypedQuery<Libro> query = em.createQuery(
                "SELECT l FROM Libro l WHERE l.titulo = :titulo",
                Libro.class);
        query.setParameter("titulo", titulo);
        return query.getResultList();
    }

    public List<Libro> buscarNombreAutor() {
        TypedQuery<Libro> query = em.createQuery(
                "SELECT l FROM Libro l WHERE l.titulo = :titulo",
                Libro.class);
        query.setParameter("titulo", titulo);
        return query.getResultList();
    }

    public List<Libro> buscarNombreEditorial() {
        TypedQuery<Libro> query = em.createQuery(
                "SELECT l FROM Libro l WHERE l.titulo = :titulo",
                Libro.class);
        query.setParameter("titulo", titulo);
        return query.getResultList();
    }

    //Consulta de todos los libros
    public void listarLiblro() {

        Collection<Libro> libros = em.createQuery("SELECT a FROM Libro a").getResultList();
        System.out.println("Lista de libros:");
        for (Libro libro1 : libros) {
            System.out.print(libro1.getEditorial() + ") " + libro1.getEditorial() + " / Estado: ");
            if (Objects.equals(libro1.isAlta(), Boolean.TRUE)) {
                System.out.println("Activo.");
            } else {
                System.out.println("No activo.");
            }
        }
    }

    public void actualizarLiblro() {
        try {
            System.out.println("Ingrese el id del  libro que se va atualizar");
            L1.setId(leer.nextLong());
            em.getTransaction().begin();
            em.merge(L1);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("error");

        }

    }

    public void eliminarLiblro(Libro id) {
        try {
            System.out.println("ingrse id a eliminar");
            L1.setId(leer.nextLong());
            Libro L1 = em.find(Libro.class, id);
            em.getTransaction().begin();
            em.remove(L1);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error el nombre no fue elimino");
        }
    }

}
