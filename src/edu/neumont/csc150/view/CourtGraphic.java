package edu.neumont.csc150.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class CourtGraphic extends JPanel implements ActionListener, KeyListener {
	
	public CourtGraphic() {
		setBackground(Color.BLACK);
		
        setFocusable(true);
        addKeyListener(this);
        
        Timer timer = new Timer(1000/60, this);
        timer.start();
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.repaint();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
