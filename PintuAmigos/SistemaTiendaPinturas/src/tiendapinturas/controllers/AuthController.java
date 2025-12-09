/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendapinturas.controllers;

import tiendapinturas.DatabaseConnection;
import tiendapinturas.models.Usuario;
import java.sql.*;

public class AuthController {
    
    public static Usuario login(String email, String password) {
        String sql = "SELECT vendedor_id, nombre, email FROM vendedores WHERE email = ? AND password = ? AND activo = TRUE";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                return new Usuario(
                    rs.getInt("vendedor_id"),
                    rs.getString("nombre"),
                    rs.getString("email")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}