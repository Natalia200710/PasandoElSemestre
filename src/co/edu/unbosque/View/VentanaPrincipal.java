package co.edu.unbosque.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.Border;

public class VentanaPrincipal extends JFrame{
	private PanelTitulo panelTitulo;
	private JLabel imagenBanner;
	
	public VentanaPrincipal() {
		
		getContentPane().setLayout(new BorderLayout());
		setTitle("Emisora ForrestM");
		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		IniciarComponentes();
		setResizable(false);
		setVisible(true);
	}

	private void IniciarComponentes() {
		panelTitulo= new PanelTitulo();	
		
		add(panelTitulo, BorderLayout.NORTH);
		imagenBanner.setIcon(new ImageIcon());
	}
	
	public void imagenBanner() {
		ImageIcon Imagen = new ImageIcon("/Imagenes/BannerTitulo.jpg");
		JLabel Img = new JLabel(Imagen);
		Img.setSize(30, 30);
		add(Img, BorderLayout.NORTH); 
	}
	
	public JLabel getImagenBanner() {
		return imagenBanner;
	}

	public void setImagenBanner(JLabel imagenBanner) {
		this.imagenBanner = imagenBanner;
	}

	public PanelTitulo getPanelTitulo() {
		return panelTitulo;
	}

	public void setPanelTitulo(PanelTitulo panelTitulo) {
		this.panelTitulo = panelTitulo;
	}	
}
