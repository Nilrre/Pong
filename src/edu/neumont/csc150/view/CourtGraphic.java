package edu.neumont.csc150.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CourtGraphic extends JPanel implements ActionListener {
	
	public CourtGraphic() {
		this.setBackground(Color.GREEN);
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Add actions
	}
	
	
}
