package tienda.productos;

import tienda.interfaz.Vendible;

public abstract class Pintura implements Vendible {

    public String nombre;
    public double precio;

    public Pintura() {
        this.nombre = "Producto sin nombre";
        this.precio = 0.0;
    }

    public Pintura(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract void mostrarInformacion();

    @Override
    public double calcularPrecioFinal() {
        return precio * 1.10; // 10% impuesto
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        return calcularPrecioFinal() * (1 - porcentaje / 100);
    }

    @Override
    public String descripcionCorta() {
        return nombre + " ($" + precio + ")";
    }

    // Getters y setters
    public String getNombre() { 
        return nombre; 
    }
    public double getPrecio() { 
        return precio; 
    }

    protected void setNombre(String nombre) { 
        this.nombre = nombre; 
    }
    protected void setPrecio(double precio) { 
        this.precio = precio; 
    }
}
