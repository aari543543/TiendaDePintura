package tiendapinturas.models;

public interface Exportable {
    // Método para obtener contenido para exportar
    String obtenerContenidoExportable();
    
    // Método para obtener nombre sugerido del archivo
    String obtenerNombreArchivo();
    
    // Método default (Java 8+) - implementación por defecto
    default String obtenerExtension() {
        return ".txt";  // Extensión por defecto
    }
}