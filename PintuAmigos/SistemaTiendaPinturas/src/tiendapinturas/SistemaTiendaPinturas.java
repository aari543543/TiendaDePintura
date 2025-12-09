package tiendapinturas;

import tiendapinturas.views.LoginFrameGUI;  // Cambiar import

public class SistemaTiendaPinturas {
    public static void main(String[] args) {
        // Probar conexión
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver MySQL cargado");
        } catch (ClassNotFoundException e) {
            javax.swing.JOptionPane.showMessageDialog(null,
                "Error: Driver MySQL no encontrado");
            return;
        }
        
        // Iniciar interfaz
        java.awt.EventQueue.invokeLater(() -> {
            new LoginFrameGUI().setVisible(true);
        });
    }
}
