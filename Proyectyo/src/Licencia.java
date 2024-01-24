import javax.swing.*;

import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener,ChangeListener{
	
	private JLabel et1,et2;
	private JCheckBox check;
	private JButton boton1,boton2;
	private JScrollPane scroll;
	private JTextArea area;
	String nombre = "";
	
	public Licencia() {
		
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Licencia de Uso");
		setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
		
		Bienvenida ventanaB = new Bienvenida();
		nombre = ventanaB.texto;
		et1 = new JLabel("TÉRMINOS Y CONDICIONES");
		et1.setBounds(215, 5, 200, 30);
		et1.setFont(new Font("Andale Mono",1,14));
		et1.setForeground(new Color(0,0,0));
		add(et1);
		
		area = new JTextArea();
		area.setEditable(false);
		area.setFont(new Font("Andale Mono",0,9));
		area.setText("\n\n          TÉRMINOS Y CONDICIONES" +
		"\n\n            A. PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN LA AUTORIZACIÓN DE YUZURU MISHIMA." +
		"\n            B. PROHIBIDA LA ALTERACION DE CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS."+
		"\n            C. YUZURU MISHIMA NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE."+
		"\n\n          LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE."+
		"\n           (LA AUTORA YUZURU MISHIMA),NO SE RESPONSABILIZA DEL USO QUE USTED HAGA CON ESTE"+
		"\n            SOFTWARE Y SUS SERVICIOS, PARA ACEPTAR ESTOS TÉRMINOS Y CONDICIONES HAGA CLIC EN (ACEPTO)."+
		"\n            PARA MAYOR INFORMACIÓN SOBRE NUESTROS SERVICIOS, POR FAVOR VISITE:"+
		"\n            fanyaoijr@gmail.com");
		
		scroll = new JScrollPane(area);
		scroll.setBounds(10, 40, 575, 200);
		add(scroll);
		
		check = new JCheckBox("Yo " + nombre + " Acepto");
		check.setBounds(10, 250, 300, 30);
		check.addChangeListener(this);
		add(check);
		
		boton1 = new JButton("Continuar");
		boton1.setBounds(10, 290, 100, 30);
		boton1.addActionListener(this);
		boton1.setEnabled(false);
		add(boton1);
		
		boton2 = new JButton("No Acepto");
		boton2.setBounds(120, 290, 100, 30);
		boton2.addActionListener(this);
		boton2.setEnabled(true);
		add(boton2);
		
		ImageIcon imagen = new ImageIcon (getClass().getResource("coca-cola.png"));
		et2 = new JLabel(imagen);
		et2.setBounds(315, 135, 300, 300);
		add(et2);
		et2 = new JLabel(imagen);
		et2.setBounds(315, 135, 300, 300);
		add(et2);

	}
	public void stateChanged(ChangeEvent e) {
		if(check.isSelected() == true) {
			boton1.setEnabled(true);
			boton2.setEnabled(false);

		}else {
			boton1.setEnabled(false);
			boton2.setEnabled(true);
		}
	}
	public void actionPerformed(ActionEvent w) {
		if (w.getSource() == boton1) {
			
			Principalpage ventanaPrinci = new Principalpage();
			ventanaPrinci.setBounds(0, 0, 650, 545);
			ventanaPrinci.setVisible(true);
			ventanaPrinci.setResizable(false);
			ventanaPrinci.setLocationRelativeTo(null);
			this.setVisible(false);
			

		}else if (w.getSource() == boton2) {
			Bienvenida ventanaB = new Bienvenida();
			ventanaB.setBounds(0, 0, 350, 450);
			ventanaB.setVisible(true);
			ventanaB.setResizable(false);
			ventanaB.setLocationRelativeTo(null);
			this.setVisible(false);
			
		}
	
}
/*
	public static void main(String[] args) {
		Licencia ventanaL = new Licencia();
		ventanaL.setBounds(0,0,610,370);
		ventanaL.setVisible(true);
		ventanaL.setResizable(false);
		ventanaL.setLocationRelativeTo(null);
	}*/

}
