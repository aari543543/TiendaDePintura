package tienda.productos;

public class Esmalte extends Pintura{
    
    private String acabado;
    
    public Esmalte(String nombre, double precio, String acabado){
        super(nombre, precio);
        this.acabado = acabado;
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println("Esmalte");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Acabado: "+ acabado);
        System.out.println("Precio final: $" + calcularPrecioFinal());
    }
    
    public void aplicarConBrocha(){
        System.out.println(getNombre()+ " se aplica con brocha");
    }
}
