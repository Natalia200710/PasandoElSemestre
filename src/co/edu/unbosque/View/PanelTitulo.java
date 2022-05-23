package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelTitulo extends JPanel {

	private JLabel titulo;
	private JLabel vacio;
	private JLabel modoTransmision;
	private JLabel tipoMusica;

	public PanelTitulo() {
		setLayout(new GridLayout(1, 4));

		IniciarComponentes();
		setVisible(true);
	}
	
	public void IniciarComponentes() {
		titulo= new JLabel();
		titulo.setText("Shein Music Inc");
		titulo.setFont(new Font("Algerian",Font.PLAIN,30));
		vacio= new JLabel();
		modoTransmision= new JLabel();
		modoTransmision = new JLabel("Modo de Transmisión");
		modoTransmision.setFont(new Font("Algerian",Font.PLAIN,20));
		tipoMusica = new JLabel();
		tipoMusica.setText("Tipo de Musica");
		tipoMusica.setFont(new Font("Algerian",Font.PLAIN,20));

		add(titulo);
		add(vacio);
		add(modoTransmision);
		add(tipoMusica);	
	}
	
	public JLabel getTitulo() {
		return titulo;
	}
	
	public void setTitulo(JLabel tituloLabel) {
		titulo = tituloLabel;
	}
	
	public JLabel getVacio() {
		return vacio;
	}
	
	public void setVacio(JLabel vacio) {
		this.vacio = vacio;
	}
	
	public JLabel getModoTransmision() {
		return modoTransmision;
	}
	
	public void setModoTransmision(JLabel modoTransmisionLabel) {
		modoTransmision = modoTransmisionLabel;
	}
	
	public JLabel getTipoMusica() {
		return tipoMusica;
	}
	
	public void setTipoMusica(JLabel tipoMusicaLabel) {
		tipoMusica = tipoMusicaLabel;
	}
}
