package edu.neumont.csc150.Controller;

import edu.neumont.csc150.Ball.Ball;
import edu.neumont.csc150.User.Player;
import edu.neumont.csc150.view.PongUI;

public class Controller {
	private PongUI ui;
	private Player player1;
	private Player player2;
	private Ball ball;
	
	public void controlGUI() {
		ui = new PongUI();
		ui.guiMain();
	}
}
