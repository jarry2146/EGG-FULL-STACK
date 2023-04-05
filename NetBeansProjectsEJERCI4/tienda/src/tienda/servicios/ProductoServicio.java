package tienda.servicios;

import java.util.Scanner;
import tienda.persistencia.EntidadDaoExt;

public class ProductoServicio {
    
    private EntidadDaoExt dao;

    public ProductoServicio(EntidadDaoExt dao) {
        this.dao =new  EntidadDaoExt();
    }
 
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    
    

    public void menu() {

        boolean con = false;

        do {

            System.out.println("Eliga una opcion:");
            System.out.println("");
            System.out.println("1 Nombre de los productos de la tabal:");
            System.out.println("2 Nombre y precio de la tabla:");
            System.out.println("3 Productos entre 120 y 202:");
            System.out.println("4 Buscar portatil en en la tabla productos:");
            System.out.println("5 Nombre y precio de productos mas baratos:");

            int opc = leer.nextInt();

            switch (opc) {
                case 1:
                    this.listarNombreProductosTabla();
                    break;
                case 2:
                    this.listarNombrePrecioProductosTabla();
                    break;
                case 3:
                    this.listarProductosEntre120y202();
                    break;

                case 4:
                    this.buscarListarPortatilTablaProducto();
                    break;
                case 5:
                    this.listarNombrePrecioProductoMasBarato();
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("A salido ");
                    con = true;
                    break;
                default:
                    System.out.println("Intenta de nuevo ");

            }
        } while (con == false);

    }

    public void listarNombreProductosTabla() {

    }

    public void listarNombrePrecioProductosTabla() {

    }

    public void listarProductosEntre120y202() {

    }

    public void buscarListarPortatilTablaProducto() {

    }

    public void listarNombrePrecioProductoMasBarato() {

    }
}
