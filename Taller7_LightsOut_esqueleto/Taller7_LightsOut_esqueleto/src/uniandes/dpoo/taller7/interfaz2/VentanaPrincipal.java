package uniandes.dpoo.taller7.interfaz2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

    private PanelSuperior panelSuperior;
    private PanelDerecho panelDerecho;
    private PanelInferior panelInferior;

    public VentanaPrincipal() {
        // Establece el título de la ventana
        setTitle("Juego de LightsOut");

        // Establece el tamaño de la ventana
        setSize(new Dimension(726, 461));  

        // Configura la operación de cierre (cerrar la aplicación al cerrar la ventana)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Configura el layout
        setLayout(new BorderLayout());

        // Crear e integrar paneles
        panelSuperior = new PanelSuperior(this);
        panelDerecho = new PanelDerecho(this);
        panelInferior = new PanelInferior(this);

        // Añadir paneles a la ventana
        add(panelSuperior, BorderLayout.NORTH);
        add(panelDerecho, BorderLayout.EAST);
        add(panelInferior, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        // Crea la ventana
        VentanaPrincipal ventana = new VentanaPrincipal();
        
        // Hace visible la ventana
        ventana.setVisible(true);
    }
}
