package coleciones;

import entidad.Cliente;

import java.util.HashSet;
import java.util.Set;

public class CuentaUsuario {

    public static void main(String[] args) {

        Cliente Cl1 = new Cliente("Carlos mendez", "00001 ", 300000);
        Cliente Cl2 = new Cliente("Sandra ramires", "00002 ", 400000);
        Cliente Cl3 = new Cliente("Oscar sanchez", "00003 ", 550000);
        Cliente Cl4 = new Cliente("Rosa romero", "00004 ", 680000);

        //esto es un tipo de dato  generioco <Cliente>
        //creamos la colecion
        Set<Cliente> clientesBanco = new HashSet<Cliente>();
        //agregamos los objeptos
        clientesBanco.add(Cl1);
        clientesBanco.add(Cl2);
        clientesBanco.add(Cl3);
        clientesBanco.add(Cl4);

        for (Cliente cliente : clientesBanco) {

            System.out.println(cliente.getNombre() + " "
                    + cliente.getCuenta() + " " + cliente.getSaldo());
        }
    }
}
