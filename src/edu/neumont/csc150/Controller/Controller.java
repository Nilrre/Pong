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

public class Controller implements ActionListener, KeyListener {
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
		player1 = new Player(0,10,400,80,450,0);
		player2 = new Player(0,2470,400, 80, 450, 0);
		ball = new Ball(1250, 600, 85,85,50,50);
		court = new CourtGraphic(player1, player2, ball, this);
		ui = new PongUI();
		ui.guiMain(court);
	}

	public void move(){
		if (wPressed) {
            if (player1.getY()-player1.getyVel() > 0) {
                int vel = player1.getY() - player1.getyVel();
            	player1.setY(vel);
            }
        }
        if (sPressed) {
            if (player1.getY() + player1.getyVel() + player1.getHeight() < court.getHeight()) {
                int vel = player1.getY() + player1.getyVel();
            	player1.setY(vel);
            }
        }

		//move player 2
        if (upPressed) {
        	if (player2.getY()-player2.getyVel() > 0) {
                int vel = player2.getY() - player2.getyVel();
            	player2.setY(vel);
            }
        }
        if (downPressed) {
            if (player2.getY() + player2.getyVel() + player2.getHeight() < court.getHeight()) {
            	int vel = player2.getY() + player2.getyVel();
            	player2.setY(vel);
            }
        }
        if(ball.getX() < player1.getX()){
        	int score = player1.getScore() + 1;
        	player1.setScore(score);
        }else if(ball.getX() > player2.getX()){
        	int score = player2.getScore() + 1;
        	player2.setScore(score);
        }
	}
	
	public void keyTyped(KeyEvent e) {}



    public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                upPressed = true;
            }
            else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                downPressed = true;
            }
            else if (e.getKeyCode() == KeyEvent.VK_W) {
                wPressed = true;
            }
            else if (e.getKeyCode() == KeyEvent.VK_S) {
                sPressed = true;
        }
    }


    public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                upPressed = false;
            }
            else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                downPressed = false;
            }
            else if (e.getKeyCode() == KeyEvent.VK_W) {
                wPressed = false;
            }
            else if (e.getKeyCode() == KeyEvent.VK_S) {
                sPressed = false;
            }
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
