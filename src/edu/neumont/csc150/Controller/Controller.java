package edu.neumont.csc150.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;

import edu.neumont.csc150.Ball.Ball;
import edu.neumont.csc150.User.Player;
import edu.neumont.csc150.view.CourtGraphic;
import edu.neumont.csc150.view.PongUI;

public class Controller implements ActionListener {
	private boolean upPressed = false;
	private boolean downPressed = false;
	private boolean sPressed = false;
	private boolean wPressed = false;
	private PongUI ui;
	private Player player1;
	private Player player2;
	private Ball ball;
	private CourtGraphic court;
	
	public void controlGUI() {		
		player1 = new Player(0,10,400,80,450,10);
		player2 = new Player(0,2470,400, 80, 450, 10);
		ball = new Ball(1250, 600, 85,85,20,20);
		court = new CourtGraphic(player1, player2, ball, this);
		ui = new PongUI();
		ui.guiMain(court);
	}

	public void move(){
		//move player 1
		if (wPressed) {
			player1.moveUp();
        }
        if (sPressed) {
        	player1.moveDown();
        }

		//move player 2
        if (upPressed) {
        	player2.moveUp();
        }
        if (downPressed) {
            player2.moveDown();
        }
	}
	
	/**
	 * @return the upPressed
	 */
	public boolean isUpPressed() {
		return upPressed;
	}

	/**
	 * @param upPressed the upPressed to set
	 */
	public void setUpPressed(boolean upPressed) {
		this.upPressed = upPressed;
	}

	/**
	 * @return the downPressed
	 */
	public boolean isDownPressed() {
		return downPressed;
	}

	/**
	 * @param downPressed the downPressed to set
	 */
	public void setDownPressed(boolean downPressed) {
		this.downPressed = downPressed;
	}

	/**
	 * @return the sPressed
	 */
	public boolean issPressed() {
		return sPressed;
	}

	/**
	 * @param sPressed the sPressed to set
	 */
	public void setsPressed(boolean sPressed) {
		this.sPressed = sPressed;
	}

	/**
	 * @return the wPressed
	 */
	public boolean iswPressed() {
		return wPressed;
	}

	/**
	 * @param wPressed the wPressed to set
	 */
	public void setwPressed(boolean wPressed) {
		this.wPressed = wPressed;
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource() == ui.getNewGame()) {
			player1.setScore(0);
			player2.setScore(0);
		}else if(evt.getSource() == ui.getQuit()) {
			ui.getFrame().dispatchEvent(new WindowEvent(ui.getFrame(), WindowEvent.WINDOW_CLOSING));

		}
	}
}
