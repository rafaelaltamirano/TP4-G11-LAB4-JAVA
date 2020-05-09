package Tarea_4;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;

public class PanelListadoPeliculas extends JPanel {
//private JScrollPane scrollPane;
private JList<Pelicula> jList;
private DefaultListModel<Pelicula> listModel;


	private static final long serialVersionUID = 1L;
	public PanelListadoPeliculas() {
		
		JList list = new JList();
		add(list);
		

	}
	public void setDefaultListModel(DefaultListModel<Pelicula> listModel) {
		this.listModel = listModel;
		jList.setModel(this.listModel);
	}
}
