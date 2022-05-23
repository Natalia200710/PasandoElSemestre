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
	}

	public PanelTitulo getPanelTitulo() {
		return panelTitulo;
	}

	public void setPanelTitulo(PanelTitulo panelTitulo) {
		this.panelTitulo = panelTitulo;
	}	
}
