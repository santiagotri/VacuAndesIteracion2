package uniandes.isis2304.vacuandes.interfazApp;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class InterfazDate extends JFrame {
	private JPanel panel;
	private DateTextField dateTextField;
	
	private JLabel labelFecha;
	private JLabel labelHora;
	
	private JButton submit;

	private String usuarioIngresado;
	private String contrasenaIngresada;

	InterfazVacuandesApp interfazVacuandes;

	public InterfazDate(InterfazVacuandesApp pInterfaz) {

		labelFecha = new JLabel ("Fecha de la cita");
		labelHora = new JLabel ("Hora de la cita");
		dateTextField= new DateTextField();
		panel = new JPanel(new GridLayout(2, 2));
		 submit = new JButton("Verificar_disponibilidad");
		
		String [] opciones1 = {
				"7:00", //1 
				"7:30", //2
				"8:00", //3
				"8:30", //4
				"9:00", //5
				"9:30", //6
				"10:00", //7
				"10:30", //8
				"11:00", //9
				"11:30",//10
				"12:00", //11
				"12:30", //12
				"13:00", //13
				"13:30", //14
				"14:00", //15
				"14:30", //16
				"15:00", //17
				"15:30",//18
				"16:00", //19
				"16:30", //20
				"17:00"};//21
		JComboBox optionList1 = new JComboBox(opciones1);
		optionList1.setSelectedIndex(0);
		
		
		panel.add(labelFecha);
		panel.add(dateTextField);
		panel.add(labelHora);
		panel.add(optionList1);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Adding the listeners to components..
		add(panel, BorderLayout.CENTER);
		submit.addActionListener(pInterfaz);
		add(submit, BorderLayout.SOUTH);
		setTitle("Iniciar sesion");
		setSize(450,125);
		setVisible(true);
	}
	
	public Date getDate () {
		return dateTextField.getDate();
	}
}
