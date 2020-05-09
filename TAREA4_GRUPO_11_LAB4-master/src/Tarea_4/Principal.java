package Tarea_4;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {
private static final long serialVersionUID = 1L;
public static DefaultListModel<Pelicula> listModel;
private static JPanel contentPane;


public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				//INSTANCIO EL LIST MODEL\
				listModel = new DefaultListModel<Pelicula>();
				Principal frame = new Principal();
				
			
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});

}


public Principal() {	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu MenuPeliculas = new JMenu("Peliculas");
		menuBar.add(MenuPeliculas);
		
		JMenuItem MenuItemAgregarPeliculas = new JMenuItem("Agregar");
		MenuItemAgregarPeliculas.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent arg0) {
				
				contentPane.removeAll();// remuevo lo que contiene el panel
				//Abro el formulario PanelIngresoPeliculas en la ventana principal
				PanelIngresoPeliculas panel = new PanelIngresoPeliculas();
				panel.setDefaultListModel(listModel);// paso el model a travez del set 
				contentPane.add(panel);
				contentPane.repaint();
				contentPane.revalidate();
				
			}
		});
		MenuPeliculas.add(MenuItemAgregarPeliculas);
		
		JMenuItem MenuItemListarPeliculas = new JMenuItem("Listar");
		MenuItemListarPeliculas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.removeAll();
				PanelListadoPeliculas panel = new PanelListadoPeliculas();
				panel.setDefaultListModel(listModel);
				contentPane.add(panel);
				contentPane.repaint();
				contentPane.revalidate();
				
			}
		});
		MenuPeliculas.add(MenuItemListarPeliculas);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}