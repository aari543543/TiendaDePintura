package tienda.productos;

public class Barniz extends Pintura {

    private String tipo;

    public Barniz(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Barniz");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Tipo: " + tipo);
        System.out.println("Precio final: $" + calcularPrecioFinal());
    }

    public void protegerSuperficie() {
        System.out.println("El barniz " + getNombre() + " protege madera y metal.");
    }
}
