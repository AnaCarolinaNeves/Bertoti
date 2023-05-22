package mvc;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class View implements ActionListener, Observer {
	private Subject model;
	private controllerInterface controller;
	private String banda = "0";
	private String nomeMusica = "0";
	private String album = "0";
	
	JFrame frame;
	JPanel panelBotoes;
	JPanel panelInfo;
	JPanel panelBand;
	JPanel panelMus;
	JPanel panelAlb;
	JLabel labelBand;
	JLabel labelMus;
	JLabel labelAlb;
	JLabel bandText;
	JLabel musText;
	JLabel albText;
	JButton tocar;
//	JButton avancar;
	JButton cancelar;
	
	public View(Subject mo, controllerInterface co) {
		this.model = mo;
		this.controller = co;
	}
	
	
	public void createView(){
		
		frame = new JFrame("");
		panelBotoes = new JPanel();
		panelInfo = new JPanel();
		panelBand = new JPanel();
		panelMus = new JPanel();
		panelAlb = new JPanel();
		tocar = new JButton("Escutar Música");
//		avancar = new JButton("Próxima música");
		cancelar = new JButton("Parar Música");
		labelBand = new JLabel();
		labelMus = new JLabel();
		labelAlb = new JLabel();
		bandText = new JLabel("Banda");
		musText = new JLabel("Nome da música");
		albText = new JLabel("Álbum");
		
		
		tocar.addActionListener(this);
//		avancar.addActionListener(this);
		cancelar.addActionListener(this);
		
		panelBotoes.add(tocar);
//		panelBotoes.add(avancar);
		panelBotoes.add(cancelar);
		panelBand.add(bandText);
		panelBand.add(labelBand);
		panelMus.add(musText);
		panelMus.add(labelMus);
		panelAlb.add(albText);
		panelAlb.add(labelAlb);
		panelInfo.add(panelBand);
		panelInfo.add(panelMus);
		panelInfo.add(panelAlb);
		frame.getContentPane().add(BorderLayout.SOUTH, panelBotoes);
		frame.getContentPane().add(BorderLayout.CENTER, panelInfo);
		
		labelBand.setText(banda);
		labelMus.setText(nomeMusica);
		labelAlb.setText(album);
		
		
		frame.setSize(450, 200);
		frame.setVisible(true);
		
	}

	public void update(String band, String mus, String alb) {
	    banda = band;
	    nomeMusica = mus;
	    album = alb;
	        
	    display();
	}

    public void display() {
        labelBand.setText(banda);
        labelMus.setText(nomeMusica);
        labelAlb.setText(album);
        
        frame.repaint();
    }
	
	public void habilitarBotaoTocar(){
		
		tocar.setEnabled(true);
		
	}
	
	public void desabilitarBotaoTocar(){
		
		tocar.setEnabled(false);
		
	}
	
//	public void habilitarBotaoAvancar() {
//		avancar.setEnabled(true);
//	}
//	
//	public void desabilitarBotaoAvancar() {
//		avancar.setEnabled(false);
//	}
	
	
	public void habilitarBotaoParar(){
		
		cancelar.setEnabled(true);
		
	}
	
	public void desabilitarBotaoParar(){
		
		cancelar.setEnabled(false);
		
	}
	
	public void actionPerformed(ActionEvent event){
		if (event.getSource() == tocar){
				controller.tocar();
		}
		if (event.getSource() == cancelar){
				controller.parar();
		}
//		if(event.getSource() == avancar) {
//			controller.avancar();
//		}
	}
}

