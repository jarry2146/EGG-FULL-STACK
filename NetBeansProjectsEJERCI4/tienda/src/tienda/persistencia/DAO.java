package tienda.persistencia;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class DAO {

    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;

    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.jdbc.Driver";

    protected void conectarBase() throws ClassNotFoundException, SQLException {

        try {
            Class.forName(DRIVER);
            String urlbasededatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            conexion = DriverManager.getConnection(urlbasededatos, USER, PASSWORD);

        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }
    }

    protected void desconectarBase() throws Exception {
        try {

            if (conexion.isClosed()) {
                return; // La conexión ya está cerrada, no es necesario desconectarla
            }
            conexion.close(); // Cerrar la conexión
            System.out.println("Base de datos desconectada");
        } catch (SQLException ex) {
            System.err.println("Error al desconectar la base de datos: " + ex.getMessage());
        }
    }

    public void insertData(String nombre, String precio, String codigoFabricante) {
        String sql = "INSERT INTO users(codigo, nombre, precio,codigoFabricante) VALUES (?, ?, ?,?)";
        try (Connection con = getConnection();
                PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, nombre);
            pstmt.setString(2, precio);
            pstmt.setString(3, codigoFabricante);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateData(int codigo, String nombre, String precio, String codigoFabricante) {
        String sql = "UPDATE users SET name = ?, email = ?, phone = ? WHERE id = ?";
        try (Connection con = getConnection();
                PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, nombre);
            pstmt.setString(2, precio);
            pstmt.setString(3, codigoFabricante);
            pstmt.setInt(4, codigo);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteData(int id) {
        String sql = "DELETE FROM users WHERE id = ?";
        try (Connection con = getConnection();
                PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
