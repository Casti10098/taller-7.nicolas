package uniandes.dpoo.taller7.interfaz4;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;



public class PanelSuperior extends JPanel
{
	private VentanaPrincipal ventanaPrincipal; 
	JRadioButton easy;
	JRadioButton medium;
	JRadioButton hard;

	JComboBox<String> cb;

	public PanelSuperior(VentanaPrincipal ventanaPrincipal)
	{

		this.ventanaPrincipal = ventanaPrincipal;
		GridLayout layout = new GridLayout(0, 6, 10, 0); //la cuadrícula tendrá 6 columnas y 0 filas especificadas.
		                                                 //El tercer parámetro es el espacio horizontal entre las celdas 
		                                                 //y el cuarto parámetro es el espacio vertical entre las celdas.
		this.setLayout(layout);
		Color colorDeFondo = new Color(173, 216, 230);

		Border borde = BorderFactory.createTitledBorder("Opciones del juego");
		this.setBorder(borde);

		JLabel tamanio = new JLabel("Tamano:");
		tamanio.setAlignmentX(LEFT_ALIGNMENT);
		this.add(tamanio);
        
		//Crear opciones de tamaño
		String[] opciones = { "4x4", "5x5", "6x6", "7x7", "8x8", "9x9" };
		
		//Crear variable para meter las opciones en una caja de la interfaz que pueda ver el usuario
		cb = new JComboBox<String>(opciones);
		cb.setMaximumSize(getPreferredSize());
		cb.setAlignmentX(LEFT_ALIGNMENT);
		cb.addActionListener(ventanaPrincipal);
		
		this.add(cb);

		JLabel dificultadLbl = new JLabel("Dificultad:");
		this.add(dificultadLbl);
		
		// La dificultad es facil por default
		
		easy = new JRadioButton("Facil", true); 
		medium = new JRadioButton("Medio", false);
		hard = new JRadioButton("Dificil", false);
		
		ButtonGroup group = new ButtonGroup();
		group.add(easy);
		group.add(medium);
		group.add(hard);

		easy.addActionListener(ventanaPrincipal);
		medium.addActionListener(ventanaPrincipal);
		hard.addActionListener(ventanaPrincipal);

		
		//Añadir las dificultades
		
		this.add(easy);
		this.add(medium);
		this.add(hard);
		this.setBackground(colorDeFondo);

		
	}

}
