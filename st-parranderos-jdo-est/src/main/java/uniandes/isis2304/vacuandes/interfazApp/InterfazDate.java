package uniandes.isis2304.vacuandes.interfazApp;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class InterfazDate extends JFrame {
	JPanel panel;
	DateTextField dateTextField;

	private String usuarioIngresado;
	private String contrasenaIngresada;

	InterfazVacuandesApp interfazVacuandes;

	public InterfazDate(InterfazVacuandesApp pInterfaz) {

		DateTextField dateTextField= new DateTextField();
		panel = new JPanel(new GridLayout(3, 1));
		panel.add(dateTextField);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Adding the listeners to components..
		add(panel, BorderLayout.CENTER);
		setTitle("Iniciar sesion");
		setSize(450,125);
		setVisible(true);
	}
	
	public Date getDate () {
		return dateTextField.getDate();
	}
}
