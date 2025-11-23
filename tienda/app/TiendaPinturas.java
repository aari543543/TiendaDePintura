package tienda.app;

import tienda.productos.PinturaAcrilica;

public class TiendaPinturas {

    public static void main(String[] args) {
        PinturaAcrilica pintura = new PinturaAcrilica("Acrilico Premium", 150.0, "Rojo Carmesi",19);

        pintura.mostrarInformacion();
        System.out.println("");
        
        //método específico de la subclase
        pintura.mezclarConAgua(20);
    }
    
}
