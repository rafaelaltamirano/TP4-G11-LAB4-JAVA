package Tarea_4;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PanelIngresoPeliculas extends JPanel {
	

	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private DefaultListModel<Pelicula> listModel;

	
	public PanelIngresoPeliculas() {
		setLayout(null);
		
		JLabel lblID = new JLabel("ID");
		lblID.setBounds(90, 47, 53, 34);
		add(lblID);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(90, 106, 53, 34);
		add(lblNombre);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(90, 173, 53, 34);
		add(lblGenero);
		
		JComboBox cboxGenero = new JComboBox();
		cboxGenero.setBounds(237, 179, 116, 22);
		add(cboxGenero);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(237, 112, 116, 22);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Numero");
		lblNewLabel.setBounds(237, 56, 56, 16);
		add(lblNewLabel);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(172, 262, 97, 25);
		add(btnAceptar);

	}




	public void setDefaultListModel(DefaultListModel<Pelicula> listModelRecibido) {//recibe el list model
		this.listModel = listModelRecibido; // lo asocio a una variable list model 
		
	}

}