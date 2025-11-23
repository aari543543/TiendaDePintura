package tienda.interfaz;

public interface Vendible {
    double calcularPrecioFinal();

    double aplicarDescuento(double porcentaje);

    String descripcionCorta();
}
