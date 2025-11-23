package tienda.productos;

public class PinturaAerosol extends Pintura{
    
    private boolean esMetalica;
    
    public PinturaAerosol (String nombre, double precio, boolean esMetalica){
        super(nombre, precio);
        this.esMetalica = esMetalica;
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Barniz");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Es Metalica: " + (esMetalica ? "Si" : "No"));
        System.out.println("Precio final: $" + calcularPrecioFinal());
    }
    
    public void agitar(){
        System.out.println("Agitando la lata de " + getNombre() + "...");
    }
}
