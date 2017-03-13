import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Datos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textoNombre;
	private JTextField textoZona;
	private JTextField textoAltura;

	/**
	 * Create the dialog.
	 */
		 
	public Datos(javax.swing.JFrame parent, String titulo, boolean modal){
		
		super(parent,titulo,modal);
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel labelIntroduccionDeDatos = new JLabel("INTRODUCCION DE DATOS");
			labelIntroduccionDeDatos.setBackground(new Color(240, 240, 240));
			labelIntroduccionDeDatos.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
			labelIntroduccionDeDatos.setBounds(102, 21, 201, 27);
			contentPanel.add(labelIntroduccionDeDatos);
		}
		{
			JLabel labelNombre = new JLabel("NOMBRE:");
			labelNombre.setBounds(101, 66, 65, 14);
			contentPanel.add(labelNombre);
		}
		{
			JLabel labelZona = new JLabel("ZONA:");
			labelZona.setBounds(102, 106, 64, 14);
			contentPanel.add(labelZona);
		}
		{
			JLabel labelAltura = new JLabel("ALTURA:");
			labelAltura.setBounds(102, 145, 64, 14);
			contentPanel.add(labelAltura);
		}
		{
			textoNombre = new JTextField();
			textoNombre.setBounds(176, 63, 86, 20);
			contentPanel.add(textoNombre);
			textoNombre.setColumns(10);
		}
		{
			textoZona = new JTextField();
			textoZona.setBounds(176, 103, 86, 20);
			contentPanel.add(textoZona);
			textoZona.setColumns(10);
		}
		{
			textoAltura = new JTextField();
			textoAltura.setBounds(176, 142, 86, 20);
			contentPanel.add(textoAltura);
			textoAltura.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton botonGuardar = new JButton("Guardar");
				botonGuardar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String nombre = textoNombre.getText();
						String zona = textoZona.getText();
						double altura = Double.parseDouble(textoAltura.getText());
						
						Arbol arbol = new Arbol(nombre,zona,altura);
						((Main) getParent()).anadirArbol(arbol);
						}
				});
				botonGuardar.setActionCommand("Guardar");
				buttonPane.add(botonGuardar);
				getRootPane().setDefaultButton(botonGuardar);
			}
			{
				JButton botonCancelar = new JButton("Cancelar");
				botonCancelar.setActionCommand("Cancelar");
				buttonPane.add(botonCancelar);
			}
		}
	}

}
