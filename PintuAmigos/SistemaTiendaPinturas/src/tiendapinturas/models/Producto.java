/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendapinturas.models;

public class Producto implements Exportable{
    private int id;
    private String codigo;
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;
    
    public Producto(int id, String codigo, String nombre, String categoria, double precio, int stock) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }
    
    // Getters
    public int getId() { return id; }
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public String getCategoria() { return categoria; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
    
    @Override
    public String obtenerContenidoExportable() {
        StringBuilder contenido = new StringBuilder();
        contenido.append("INFORMACIÓN DEL PRODUCTO\n");
        contenido.append("=======================\n");
        contenido.append("ID: ").append(id).append("\n");
        contenido.append("Código: ").append(codigo).append("\n");
        contenido.append("Nombre: ").append(nombre).append("\n");
        contenido.append("Categoría: ").append(categoria).append("\n");
        contenido.append("Precio: $").append(String.format("%.2f", precio)).append("\n");
        contenido.append("Stock: ").append(stock).append("\n");
        contenido.append("=======================\n");
        return contenido.toString();
    }
    
    @Override
    public String obtenerNombreArchivo() {
        // Nombre seguro para archivo (sin espacios ni caracteres especiales)
        return "Producto_" + codigo.replace(" ", "_").replace("/", "_");
    }
}
