import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class Datos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textoNombre;
	private JTextField textoZona;
	private JTextField textoAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Datos dialog = new Datos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Datos() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel labelIntroduccionDeDatos = new JLabel("INTRODUCCION DE DATOS");
			labelIntroduccionDeDatos.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
			labelIntroduccionDeDatos.setBounds(102, 21, 201, 27);
			contentPanel.add(labelIntroduccionDeDatos);
		}
		{
			JLabel labelNombre = new JLabel("NOMBRE:");
			labelNombre.setBounds(102, 66, 46, 14);
			contentPanel.add(labelNombre);
		}
		{
			JLabel labelZona = new JLabel("ZONA:");
			labelZona.setBounds(102, 106, 46, 14);
			contentPanel.add(labelZona);
		}
		{
			JLabel labelAltura = new JLabel("ALTURA:");
			labelAltura.setBounds(102, 145, 46, 14);
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
			JButton botonInsertar = new JButton("Insertar");
			botonInsertar.setBounds(233, 194, 89, 23);
			contentPanel.add(botonInsertar);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
