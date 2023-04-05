//package principal.persistencia;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import principal.dominio.usuario.Usuario;
//
//public final class UsuarioDAO extends DAO {
//
//    public void gurdarUsuario(UsuarioDAO usuario) {
//
//        try {
//            if (usuario == null) {
//                throw new Exception("debe indicar un usuario");
//
//                }
//                String sql="INSERT INTO usuario (correoElectronico,clave)"
//                        +"values('" + usuario.getCorreoElectronico()+"','"+usuario.getClave()+'");";
//            insertatModoficarEliminar(sql);
//            }
//
//        } catch (Exception e) {
//        try {
//            throw e;
//        } catch (Exception ex) {
//          
//        }
//
//    }
//
//}
