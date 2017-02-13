package edu.neumont.csc150.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import edu.neumont.csc150.User.Player;

@SuppressWarnings("serial")
public class CourtGraphic extends JPanel implements ActionListener, KeyListener {
	
	private Player player1;
	private Player player2;
	
	public CourtGraphic( Player one, Player two) {
		setBackground(Color.BLACK);
		player1 = one;
		player2 = two;
		
        setFocusable(true);
        addKeyListener(this);
        
        Timer timer = new Timer(1000/60, this);
        timer.start();
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		
        for (int lineY = 0; lineY < getHeight(); lineY += 50) {
            g.drawLine(250, lineY, 250, lineY+25);
        }
        
        g.setFont(new Font(Font.DIALOG, Font.BOLD, 36));
        g.drawString(String.valueOf(player1.getScore()), 100, 100);
        g.drawString(String.valueOf(player2.getScore()), 400, 100);
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
