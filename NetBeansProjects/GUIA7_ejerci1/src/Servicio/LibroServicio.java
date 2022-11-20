/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
*/
package Servicio;


import entida.Libro;
import java.util.Scanner;

public class LibroServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro CargarLibro() {
    
          //obra = new Libro();
        Libro m1=new Libro();
        System.out.println("ingrese ISBN del libro ");
        m1.setISBN(leer.next());
        System.out.println("ingrese titulo ");
        m1.setTitulo(leer.next()); 
        System.out.println("ingrese autor ");
        m1.setAutor(leer.next()); 
        System.out.println("ingrese paginas ");
        m1.setPaginas(leer.nextInt());
        
    return m1;
    }

    public void MostrarLibro(Libro m1) {
       // obra = new Libro();

        System.out.println("los datos ingresados son los siguientes");
        System.out.println(m1.toString());
    }

    
       
    }

