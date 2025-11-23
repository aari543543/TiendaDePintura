package tienda.productos;

public class PinturaAcrilica extends Pintura {

    private String color;
    private double litros;

    public PinturaAcrilica(String nombre, double precio, String color, double litros) {
        super(nombre, precio);
        this.color = color;
        this.litros = litros;
    }

    //Metodo abstracto
    @Override
    public void mostrarInformacion() {
        System.out.println("Pintura Acrilica");
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Litros: " + litros);
        //System.out.println("Precio base: $" + precio);
        System.out.println("Precio con impuesto: $" + calcularPrecioFinal());
    }

    // Método de la subclase
    public void mezclarConAgua(int porcentaje) {
        System.out.println("La pintura " + nombre + " ha sido diluida con " + porcentaje + "% de agua.");
    }
}
