import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class Principalpage extends JFrame implements ActionListener {
	
	private JMenuBar men;
	private JMenu menuOpciones, menuCalcular, menuAcerca, menuColor;
	private JMenuItem calculo,rojo,negro,morado,creador,salir,nuevo;
	private JLabel etiquetaLogo, etiquetaBienvenida, etiquetaTitulo, etiquetaNombre,etiquetaAPaterno,
					etiquetaAMaterno,etiquetaDepartamento,etiquetaAntiguedad,etiquetaResultado,etiquetaFooter;
	private JTextField cajaNombre,cajaPaterno,cajaMaterno;
	private JComboBox comboDepa, comboAntiguedad;
	private JScrollPane scroll;
	private JTextArea area;
	String nombreAdmi = "";
	

	public Principalpage () {
		
		setLayout (null);
		setTitle("Pantalla principal");
		getContentPane().setBackground(new Color(255,0,0));
		setIconImage (new ImageIcon (getClass().getResource("icon.png")).getImage());
		
		Bienvenida ventanaBi = new Bienvenida();
		nombreAdmi = ventanaBi.texto;
		
		men =new JMenuBar();
		men.setBackground(new Color(255,0,0));
		setJMenuBar(men);
		
		menuOpciones = new JMenu ("Opciones");
		menuOpciones.setBackground(new Color (255,0,0));
		menuOpciones.setFont(new Font("A M",1,14));
		menuOpciones.setForeground(new Color(255,255,255));
		men.add(menuOpciones);
		
		menuCalcular = new JMenu ("Calcular");
		menuCalcular.setBackground(new Color(255,0,0));
		menuCalcular.setFont(new Font("A M", 1,14));
		menuCalcular.setForeground(new Color(255,255,255));
		men.add(menuCalcular);
		
		menuAcerca = new JMenu ("Acerca de");
		menuAcerca.setBackground(new Color(255,0,0));
		menuAcerca.setFont(new Font("A M", 1,14));
		menuAcerca.setForeground(new Color(255,255,255));
		men.add(menuAcerca);
		
		menuColor = new JMenu ("Color de fondo");
		menuColor.setFont(new Font("A M", 1,14));
		menuColor.setForeground(new Color(255,0,0));
		menuOpciones.add(menuColor);
		
		calculo = new JMenuItem ("Vacaciones");
		calculo.setFont(new Font("A M", 1,14));
		calculo.setForeground(new Color(255,0,0));
		menuCalcular.add(calculo);
		calculo.addActionListener(this);
		
		rojo = new JMenuItem ("Rojo");
		rojo.setFont(new Font("A M", 1, 14));
		rojo.setForeground(new Color(255,0,0));
		menuColor.add(rojo);
		rojo.addActionListener(this);
		
		negro = new JMenuItem ("Negro");
		negro.setFont(new Font("A M", 1, 14));
		negro.setForeground(new Color(255,0,0));
		menuColor.add(negro);
		negro.addActionListener(this);
		
		morado = new JMenuItem ("Morado");
		morado.setFont(new Font("A M", 1, 14));
		morado.setForeground(new Color(255,0,0));
		menuColor.add(morado);
		morado.addActionListener(this);
		
		nuevo = new JMenuItem ("Nuevo");
		nuevo.setFont(new Font("A M", 1, 14));
		nuevo.setForeground(new Color(255,0,0));
		menuColor.add(nuevo);
		nuevo.addActionListener(this);
		
		creador = new JMenuItem ("El Creador");
		creador.setFont(new Font("A M", 1, 14));
		creador.setForeground(new Color(255,0,0));
		menuAcerca.add(creador);
		creador.addActionListener(this);
		
		salir = new JMenuItem ("Salir");
		salir.setFont(new Font("A M", 1, 14));
		salir.setForeground(new Color(255,0,0));
		menuOpciones.add(salir);
		salir.addActionListener(this);
		
		ImageIcon imagen = new ImageIcon (getClass().getResource("logo-coca.png"));
		etiquetaLogo = new JLabel (imagen);
		etiquetaLogo.setBounds(5,5,250,100);
		add(etiquetaLogo);
		
		etiquetaBienvenida = new JLabel ("Bienvenido " + nombreAdmi);
		etiquetaBienvenida.setBounds(280,30,300,50);
		etiquetaBienvenida.setFont(new Font("A M", 1,32));
		etiquetaBienvenida.setForeground(new Color (255,255,255));
		add(etiquetaBienvenida);
		
		etiquetaTitulo = new JLabel ("Datos del trabajador para calcular sus vacaciones");
		etiquetaTitulo.setBounds(45,140,900,25);
		etiquetaTitulo.setFont(new Font("A M", 1,24));
		etiquetaTitulo.setForeground(new Color (255,255,255));
		add(etiquetaTitulo);
		
		etiquetaNombre = new JLabel ("Nombre completo:");
		etiquetaNombre.setBounds(25,188,180,25);
		etiquetaNombre.setFont(new Font("A M", 1,12));
		etiquetaNombre.setForeground(new Color (255,255,255));
		add(etiquetaNombre);
		
		cajaNombre = new JTextField();
		cajaNombre.setBounds(25,213,150,25);
		cajaNombre.setBackground(new java.awt.Color(224,224,244));
		cajaNombre.setFont(new java.awt.Font("A M",1,14));
		cajaNombre.setForeground(new java.awt.Color(255,0,0));
		add(cajaNombre);
		
		etiquetaAPaterno = new JLabel ("Apellido paterno:");
		etiquetaAPaterno.setBounds(25,248,180,25);
		etiquetaAPaterno.setFont(new Font("A M", 1,12));
		etiquetaAPaterno.setForeground(new Color (255,255,255));
		add(etiquetaAPaterno);
		
		cajaPaterno = new JTextField();
		cajaPaterno .setBounds(25,273,150,25);
		cajaPaterno.setBackground(new Color(224,224,244));
		cajaPaterno.setFont(new Font("A M",1,14));
		cajaPaterno.setForeground(new Color(255,0,0));
		add(cajaPaterno);
		
		etiquetaAMaterno = new JLabel ("Apellido materno:");
		etiquetaAMaterno.setBounds(25,308,180,25);
		etiquetaAMaterno.setFont(new Font("A M", 1,12));
		etiquetaAMaterno.setForeground(new Color (255,255,255));
		add(etiquetaAMaterno);
		
		cajaMaterno = new JTextField();
		cajaMaterno .setBounds(25,334,150,25);
		cajaMaterno.setBackground(new Color(224,224,244));
		cajaMaterno.setFont(new Font("A M",1,14));
		cajaMaterno.setForeground(new Color(255,0,0));
		add(cajaMaterno);
		
		etiquetaDepartamento = new JLabel ("Selecciona el departamento");
		etiquetaDepartamento.setBounds(220,185,199,25);
		etiquetaDepartamento.setFont(new Font("A M",1,12));
		etiquetaDepartamento.setForeground(new Color(255,255,255));
		add(etiquetaDepartamento);
		
		comboDepa = new JComboBox ();
		comboDepa.setBounds(220,213,220,25);
		comboDepa.setBackground(new Color(224,224,224));
		comboDepa.setFont(new Font("A M", 1, 14));
		comboDepa.setForeground(new Color(255,0,0));
		add(comboDepa);
		comboDepa.addItem("");
		comboDepa.addItem("Atención al cliente");
		comboDepa.addItem("Departamento de lógistica");
		comboDepa.addItem("Departamento de gerencia");
		
		etiquetaAntiguedad = new JLabel ("Selecciona la antiguedad");
		etiquetaAntiguedad.setBounds(220,248,180,25);
		etiquetaAntiguedad.setFont(new Font("A M", 1, 12));
		etiquetaAntiguedad.setForeground(new Color(255,255,0));
		add(etiquetaAntiguedad);
		
		comboAntiguedad = new JComboBox();
		comboAntiguedad.setBounds(220,273,220,25);
		comboAntiguedad.setBackground(new Color(224,224,224));
		comboAntiguedad.setFont(new Font( "A M",1,12));
		comboAntiguedad.setForeground(new Color(255,0,0));
		add(comboAntiguedad);
		comboAntiguedad.addItem("");
		comboAntiguedad.addItem("1 año de servicio");
		comboAntiguedad.addItem("2 a 6 años de servicio");
		comboAntiguedad.addItem("7 años o más de servicio");
		
		etiquetaResultado = new JLabel ("Resultado del cálculo");
		etiquetaResultado.setBounds(220,307,180,25);
		etiquetaResultado.setFont( new Font("A M", 1,12));
		etiquetaResultado.setForeground(new Color (255,255,255));
		add(etiquetaResultado);
		
		area = new JTextArea();
		area.setEditable(false);
		area.setBackground(new Color(224,244,224));
		area.setFont(new Font ("A M",1,11));
		area.setForeground(new Color(255,0,0));
		area.setText("\n       Aquí aparece el resilyado del cálculo de vacaciones");
		scroll = new JScrollPane(area);
		scroll.setBounds(220,333,305,90);
		add(scroll);
		
		etiquetaFooter = new JLabel ("© 2023 The Cola-Cola Company | Todos los Derechos reservados");
		etiquetaFooter.setBounds(135,445,500,30);
		etiquetaFooter.setFont(new Font ("A M", 1,12));
		etiquetaFooter.setForeground(new Color(255,255,255));
		add(etiquetaFooter);
	}
		
		public void actionPerformed (ActionEvent p) {
			
			if(p.getSource() == calculo) {
				
				String nombre = cajaNombre.getText();
				String apaterno = cajaPaterno.getText();
				String amaterno = cajaMaterno.getText();
				String depa = comboDepa.getSelectedItem().toString();
				String antigue = comboAntiguedad.getSelectedItem().toString();
				
				if(nombre.equals("") || apaterno.equals("") || amaterno.equals("") ||
						depa.equals("") || antigue.equals("")) {
					JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
				
			}else{
			
				if(depa.equals("Atención al cliente")) {
				
					if (antigue.equals("1 año de servicio")) {
						area.setText("\n     El trabajador" + " " + " " + nombre + " " + apaterno + " " + amaterno +
									"\n      quien labora en " + depa + " con " + antigue +
									"\n      recibe 6 días de vacaciones");
					}
					
					if (antigue.equals("2 a 6 años de servicio")) {
						
						area.setText ("\n     El trabajador" + nombre + " " + apaterno + " " + amaterno +
								"\n      quien labora en " + depa + " con " + antigue +
								"\n      recibe 14 días de vacaciones");
					}
					
					if (antigue.equals("7 años o más de servicio")) {
						
						area.setText ("\n     El trabajador" + nombre + " " + apaterno + " " + amaterno +
								"\n      quien labora en " + depa + " con " + antigue +
								"\n      recibe 20 días de vacaciones");
					}
				}
				if(depa.equals("Departamento de lógistica")) {
					
					if (antigue.equals("1 año de servicio")) {
						area.setText("\n     El trabajador " + nombre + " " + apaterno + " " + amaterno +
									"\n      quien labora en " + depa + " con " + antigue +
									"\n      recibe 7 días de vacaciones");
					}
					
					if (antigue.equals("2 a 6 años de servicio")) {
						
						area.setText ("\n     El trabajador " + nombre + " " + apaterno + " " + amaterno +
								"\n      quien labora en " + depa + " con " + antigue +
								"\n      recibe 15 días de vacaciones");
					}
					
					if (antigue.equals("7 años o más de servicio")) {
						
						area.setText ("\n     El trabajador " + nombre + " " + apaterno + " " + amaterno +
								"\n      quien labora en " + depa + " con " + antigue +
								"\n      recibe 22 días de vacaciones");
					}
				}
				if(depa.equals("Departamento de gerencia")) {
					
					if (antigue.equals("1 año de servicio")) {
						area.setText("\n     El trabajador " + nombre + " " + apaterno + " " + amaterno +
									"\n      quien labora en " + depa + " con " + antigue +
									"\n      recibe 10 días de vacaciones");
					}
					
					if (antigue.equals("2 a 6 años de servicio")) {
						
						area.setText ("\n     El trabajador " + nombre + " " + apaterno + " " + amaterno +
								"\n      quien labora en " + depa + " con " + antigue +
								"\n      recibe 20 días de vacaciones");
					}
					
					if (antigue.equals("7 años o más de servicio")) {
						
						area.setText ("\n     El trabajador " + nombre + " " + apaterno + " " + amaterno +
								"\n      quien labora en " + depa + " con " + antigue +
								"\n      recibe 30 días de vacaciones");
					}
				}
			}
		}
		if (p.getSource() == rojo) {getContentPane().setBackground(new Color(255,0,0));}
		if (p.getSource() == negro) {getContentPane().setBackground(new Color(0,0,0));}
		if (p.getSource() == morado) {getContentPane().setBackground(new Color(51,0,51));}
		
		if (p.getSource() == nuevo) {
			
			cajaNombre.setText("");
			cajaPaterno.setText("");
			cajaMaterno.setText("");
			comboDepa.setSelectedIndex(0);
			comboAntiguedad.setSelectedIndex(0);
			area.setText("\n       Aquí aparece el resilyado del cálculo de vacaciones");	
		}
		
		if (p.getSource() == salir) {
			
			Bienvenida ventanaBien = new Bienvenida();
			ventanaBien.setBounds(0,0,350,450);
			ventanaBien.setVisible(true);
			ventanaBien.setResizable(false);
			ventanaBien.setLocationRelativeTo(null);
			
		}
		
		if (p.getSource() == creador) {
			
			JOptionPane.showMessageDialog(null,"Desarrollado por Mariana Fuentes \n" +
												"       fanyaoijr@gmail.com");
		}
	}
/*	public static void main(String[] args) {
	
		Principalpage ventanaPrinci = new Principalpage();
		ventanaPrinci.setBounds(0,0,650,545);
		ventanaPrinci.setVisible(true);
		ventanaPrinci.setResizable(false);
		ventanaPrinci.setLocationRelativeTo(null);

	}*/

}
