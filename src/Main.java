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

public class Main extends JFrame {

	private JPanel contentPane;

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
		
		JButton botonAbrirFormulario = new JButton("Abrir Formulario");
		botonAbrirFormulario.setBounds(153, 138, 139, 23);
		contentPane.add(botonAbrirFormulario);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(153, 86, 139, 20);
		contentPane.add(comboBox);
		
		JLabel labelListaArbol = new JLabel("LISTA DE ARBOLES");
		labelListaArbol.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		labelListaArbol.setBounds(144, 23, 147, 28);
		contentPane.add(labelListaArbol);
		
		JButton botonBorrar = new JButton("Borrar");
		botonBorrar.setBounds(263, 194, 105, 23);
		contentPane.add(botonBorrar);
	}
}