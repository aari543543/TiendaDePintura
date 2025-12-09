/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vicga
 */
package tiendapinturas.controllers;

import tiendapinturas.DatabaseConnection;
import tiendapinturas.models.Producto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoController {
    
    public static List<Producto> obtenerProductosDisponibles() {
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT producto_id, codigo, nombre, categoria, precio, stock FROM productos WHERE stock > 0";
        
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                Producto producto = new Producto(
                    rs.getInt("producto_id"),
                    rs.getString("codigo"),
                    rs.getString("nombre"),
                    rs.getString("categoria"),
                    rs.getDouble("precio"),
                    rs.getInt("stock")
                );
                productos.add(producto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productos;
    }
    
    public static Producto obtenerProductoPorId(int id) {
        String sql = "SELECT producto_id, codigo, nombre, categoria, precio, stock FROM productos WHERE producto_id = ?";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                return new Producto(
                    rs.getInt("producto_id"),
                    rs.getString("codigo"),
                    rs.getString("nombre"),
                    rs.getString("categoria"),
                    rs.getDouble("precio"),
                    rs.getInt("stock")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}