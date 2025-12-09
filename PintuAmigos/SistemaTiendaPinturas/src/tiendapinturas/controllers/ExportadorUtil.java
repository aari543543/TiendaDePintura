package tiendapinturas.controllers;

import tiendapinturas.models.Exportable;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExportadorUtil {
    
    // Método genérico que funciona con CUALQUIER objeto Exportable
    public static boolean exportar(Exportable exportable) {
        if (exportable == null) {
            return false;
        }
        
        JFileChooser fileChooser = new JFileChooser();
        
        // Usar los métodos de la interfaz
        String nombreSugerido = exportable.obtenerNombreArchivo() + exportable.obtenerExtension();
        fileChooser.setSelectedFile(new File(nombreSugerido));
        
        int resultado = fileChooser.showSaveDialog(null);
        
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            
            // Asegurar extensión correcta
            if (!archivo.getName().toLowerCase().endsWith(exportable.obtenerExtension())) {
                archivo = new File(archivo.getAbsolutePath() + exportable.obtenerExtension());
            }
            
            try (FileWriter writer = new FileWriter(archivo)) {
                writer.write(exportable.obtenerContenidoExportable());
                return true;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
        
        return false;
    }
    
    // Método sobrecargado para exportar con mensaje
    public static boolean exportarConMensaje(Exportable exportable, String titulo) {
        boolean exito = exportar(exportable);
        
        if (exito) {
            javax.swing.JOptionPane.showMessageDialog(null,
                "Archivo exportado exitosamente",
                titulo, javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(null,
                "No se pudo exportar el archivo",
                titulo, javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        
        return exito;
    }
}