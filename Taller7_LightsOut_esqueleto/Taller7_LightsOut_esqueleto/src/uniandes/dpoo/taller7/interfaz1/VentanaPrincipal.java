package uniandes.dpoo.taller7.interfaz1;


import java.awt.Dimension;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() {
        // Establece el título de la ventana
        setTitle("Juego de LightsOut");

        // Establece el tamaño de la ventana
        setSize(new Dimension(726, 461));  

        // Configura la operación de cierre (cerrar la aplicación al cerrar la ventana)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // Crea la ventana
        VentanaPrincipal ventana = new VentanaPrincipal();
        
        // Hace visible la ventana
        ventana.setVisible(true);
    }
}

    
