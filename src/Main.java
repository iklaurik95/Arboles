import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JComboBox lista;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botonInsertar = new JButton("Insertar");
		botonInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirFormulario();
				
			}
		});
		botonInsertar.setBounds(153, 138, 139, 23);
		contentPane.add(botonInsertar);
		
		JComboBox lista = new JComboBox();
		lista.setBounds(153, 86, 139, 20);
		contentPane.add(lista);
		
		JLabel labelListaArbol = new JLabel("LISTA DE ARBOLES");
		labelListaArbol.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		labelListaArbol.setBounds(144, 23, 147, 28);
		contentPane.add(labelListaArbol);
		
		JButton botonBorrar = new JButton("Borrar");
		botonBorrar.setBounds(263, 194, 105, 23);
		contentPane.add(botonBorrar);
	}

	protected void abrirFormulario() {
		// TODO Auto-generated method stub
		Datos hija = new Datos(this,"Formulario Arbol",true);
		hija.setVisible(true);
	}
	
	public void anadirArbol(Arbol arbol){
		this.lista.addItem(arbol.getNombre() + " " + arbol.getZona() + " " + arbol.getAltura());
		
	}
}
