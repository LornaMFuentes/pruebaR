import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{
	
	private JTextField caja;
	private JLabel a1,b2,c3,d4;
	private JButton boton;
	
	//Puede utilizarse en cualquier interfaz grafica
	
	public static String texto = "";
	
	public Bienvenida() {
		
		setLayout (null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Se pone el titulo
		
		setTitle("Bienvenido");
		
		//Colocamos el fondo de color rojo con RGB
		
		getContentPane().setBackground(new Color (255,0,0));
		
		//Agregamos una imagen al icono que represente nuestra intetfaz grafica
		
		setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
		
		//Colocamos una imagen en el Label
		
		ImageIcon imagen = new ImageIcon (getClass().getResource("logo-coca.png"));
		a1 = new JLabel (imagen);
		a1.setBounds(25,15,300,150);
		add(a1);
		
		b2 = new JLabel ("Sistema de control vacacional de emple");
		b2.setBounds(35,135,300,30); 
		
		/*Cambiamos tipografia de letra asi:
		 * Primero es la tipografia.
		 * 0 texto normal
		 * 1 Negrita
		 * 2 Cursiva
		 * 3 Negrita Cursiva
		 * Tamaño del texto*/
		b2.setFont(new Font("Anda la osa",3,18));
		
		//Color de texto
		
		b2.setForeground(new Color (255,255,255));
		add(b2);
		
		c3 = new JLabel ("Ingresar nombre");
		c3.setBounds(45,212,200,30);
		c3.setFont(new Font("Anda la osa",1,12));
		c3.setForeground(new Color(255,255,255));
		add(c3);
		
		//Alt 184 ©
		
		d4 = new JLabel ("© 2023 The Coca-Cola Company");
		d4.setBounds(85,375,300,30);
		d4.setFont(new Font("Anda la osa",1,12));
		d4.setForeground(new Color(255,255,255));
		add(d4);
		
		caja = new JTextField();
		caja.setBounds(45,240,255,25);
		caja.setBackground(new Color (244,224,224));
		caja.setFont(new Font ("Anda la osa", 1,14));
		caja.setForeground(new Color(255,0,0));
		add(caja);
		
		boton = new JButton ("Ingresar");
		boton.setBounds(125,280,100,30);
		boton.setBackground(new Color (255,255,255));
		boton.setFont(new Font ("Anda la osa", 1,14));
		boton.setForeground(new Color(255,0,0));
		boton.addActionListener(this);
		add(boton);
	}
	
	public void actionPerformed (ActionEvent g) {
		
		if (g.getSource() == boton) {
			
			/*
			 * El metodo .trim nos permite que... Revisar notas en el cuaderno.
			 */
			texto = caja.getText().trim();
			
			//El metodo .equals verifica lo que esta dentro de la variable texto
			
			if (texto.equals("")) {
				//Mensaje que da el sistema si no ingresas tu nombre
				JOptionPane.showMessageDialog(null, "Debe ingresar su nombre");
				
			}else {
				
				Licencia ventanaL = new Licencia ();
				 ventanaL.setBounds(0,0,600,360);
				 ventanaL.setVisible(true);
				 ventanaL.setResizable(false);
				 ventanaL.setLocationRelativeTo(null);			 
				 
			this.setVisible(false);
			}
		}
	}
		
		 	
	public static void main(String[] args) {
	
		Bienvenida ventanaB = new Bienvenida();
		ventanaB.setBounds(0, 0, 350, 450);
		ventanaB.setVisible(true);
		ventanaB.setResizable(false);
		ventanaB.setLocationRelativeTo(null);
	}

}
