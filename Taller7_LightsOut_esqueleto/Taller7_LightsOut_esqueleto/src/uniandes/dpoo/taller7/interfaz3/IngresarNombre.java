package uniandes.dpoo.taller7.interfaz3;
import java.awt.Image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;

import com.formdev.flatlaf.FlatLightLaf;

public class IngresarNombre extends JFrame implements ActionListener
{
	//Crean variables que nos van a servir para hacer la interfaz
	
	JButton boton; //Permite crear un botón visible dentro de una aplicación de interfaz gráfica de usuario en Java
	JTextField texto; //Un JTextField es un componente de Java Swing que permite la edición de una sola línea del texto
	String nombreJugador;

	public IngresarNombre()
	{
		this.setTitle("Ingresar");
		JLabel nombre = new JLabel("Ingrese su nombre para iniciar el juego");

// Boton de jugar
		boton = new JButton("Jugar");
		boton.addActionListener(this);
// Crear 16 columnas 
		texto= new JTextField(16);
		texto.addActionListener(this);
// Crear un panel para añadir las opciones y el texto  
		JPanel panel = new JPanel();
		JLabel imagen = new JLabel();
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("./data/logo.png").getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT));
		imagen.setIcon(imageIcon);
// Añadir los botones y el texto al panel 
		panel.add(imagen);
		panel.add(nombre);
		panel.add(texto);
		panel.add(boton);
// Añadir el panel al frame 
		add(panel);
// Decidir el tamaño del frame
		setSize(400, 350);
		Color colorDeFondo = new Color(255,255,255);
		this.setBackground(colorDeFondo);

//El método setLocationRelativeTo(null) se utiliza para centrar una ventana en la pantalla1. 
//Establece la posición de la ventana relativa a un componente pasado como parámetro. Si se
//le pasa null como parámetro se posiciona en el centro de la pantalla.
		
		setLocationRelativeTo(null);
		setResizable(true); //se utiliza para permitir que el usuario pueda cambiar el tamaño de la ventana. 
		                    //Si se establece en false, la ventana no se puede cambiar de tamaño.
		
		/**
		 * Como se debe comportar la ventana cuando se da cerrar
		 * Algunos de los valores posibles son:

			DO_NOTHING_ON_CLOSE: No hace nada cuando se hace clic en el botón de cerrar.
            HIDE_ON_CLOSE: Oculta la ventana cuando se hace clic en el botón de cerrar.
            DISPOSE_ON_CLOSE: Cierra la ventana y libera todos los recursos asociados a ella.
            EXIT_ON_CLOSE: Cierra la ventana y finaliza la aplicación.
		 */
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setVisible(true);
	}

	
	
	@Override
	
	/**
	 *Se utiliza para manejar el evento de acción generado por el botón. Cuando se hace clic en 
	 *el botón, el código dentro del método se ejecuta y realiza las acciones necesarias.
	 */
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == boton)
		{
			nombreJugador = texto.getText();
			new VentanaPrincipal(nombreJugador);
			this.dispose(); //es un método que se utiliza para cerrar la ventana actual en Java. 
			                //Cuando se llama a este método, se liberan todos los recursos nativos 
			                //de pantalla utilizados por la ventana actual, sus subcomponentes y todos sus hijos.
		}

	}
	
	

	public static void main(String[] args)
	{
		FlatLightLaf.install(); //FlatLaf es un aspecto moderno y de código abierto para aplicaciones de escritorio 
		                        //Java Swing multiplataforma. Tiene un aspecto casi plano (sin sombras ni gradientes), 
		                        //limpio, simple y elegante. Viene con temas Light, Dark, IntelliJ y Darcula, se escala 
		                        //en pantallas HiDPI y se ejecuta en Java 8 o posterio
		new IngresarNombre();

	}

}
