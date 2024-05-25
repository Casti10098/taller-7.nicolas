package uniandes.dpoo.taller7.interfaz2;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;

@SuppressWarnings("serial")
public class PanelDerecho extends JPanel
{
    private VentanaPrincipal primera;

    JButton nuevo;
    JButton reiniciar;
    JButton top10;
    JButton cambiarJugador;

    public PanelDerecho(VentanaPrincipal primera)
    {
        this.primera = primera;
        GridLayout layout = new GridLayout(4, 1, 5, 5); // Modifica la separación entre botones
        this.setLayout(layout);
        
        Border border = BorderFactory.createTitledBorder("Menu");
        this.setBorder(border);

        // Crea botones con texto
        nuevo = new JButton("NUEVO");
        reiniciar = new JButton("REINICIAR");
        top10 = new JButton("TOP-10");
        cambiarJugador = new JButton("CAMBIAR JUGADOR");

        // Configuración de la fuente de los botones
        Font buttonFont = new Font("Arial", Font.PLAIN, 16);
        nuevo.setFont(buttonFont);
        reiniciar.setFont(buttonFont);
        top10.setFont(buttonFont);
        cambiarJugador.setFont(buttonFont);

        // Añade botones al panel
        this.add(nuevo);
        this.add(reiniciar);
        this.add(top10);
        this.add(cambiarJugador);
        
        // Color de fondo del panel
        Color colorDeFondo = new Color(255, 255, 255); // Blanco
        this.setBackground(colorDeFondo);

        // Color de fondo y estilo de los botones
        Color botonColor = new Color(230, 230, 230); // Gris claro
        nuevo.setBackground(botonColor);
        reiniciar.setBackground(botonColor);
        top10.setBackground(botonColor);
        cambiarJugador.setBackground(botonColor);
        
        // Bordes para los botones
        Border buttonBorder = BorderFactory.createLineBorder(Color.GRAY, 1);
        nuevo.setBorder(buttonBorder);
        reiniciar.setBorder(buttonBorder);
        top10.setBorder(buttonBorder);
        cambiarJugador.setBorder(buttonBorder);
    }
}
