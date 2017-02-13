package edu.neumont.csc150.view;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class PongUI {
	private JMenuItem newGame, quit;
	private JFrame frame;
	
	/**
	 * @return the frame
	 */
	public JFrame getFrame() {
		return frame;
	}

	/**
	 * @param frame the frame to set
	 */
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public void guiMain(CourtGraphic court) {
		frame = new JFrame("Pong");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.getContentPane().add(court);
		addMenu(frame, court);
		frame.setVisible(true);
	}
	
	public void addMenu(JFrame frame, CourtGraphic graphic) {
		newGame = new JMenuItem("New Game");
		newGame.addActionListener(graphic);
		quit = new JMenuItem("Quit");
		quit.addActionListener(graphic);
		JMenu menu = new JMenu("Game");
		JMenuBar menuBar = new JMenuBar();
		
		menu.add(newGame);
		menu.addSeparator();
		menu.add(quit);
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);
	}

	/**
	 * @return the newGame
	 */
	public JMenuItem getNewGame() {
		return newGame;
	}

	/**
	 * @param newGame the newGame to set
	 */
	public void setNewGame(JMenuItem newGame) {
		this.newGame = newGame;
	}

	/**
	 * @return the quit
	 */
	public JMenuItem getQuit() {
		return quit;
	}

	/**
	 * @param quit the quit to set
	 */
	public void setQuit(JMenuItem quit) {
		this.quit = quit;
	}

}
