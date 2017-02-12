package edu.neumont.csc150.view;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class PongUI {
	
	public void guiMain() {
		JFrame frame = new JFrame("Pong");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		CourtGraphic court = new CourtGraphic();
		frame.getContentPane().add(court);
		addMenu(frame, court);
		frame.setVisible(true);
	}
	
	public void addMenu(JFrame frame, CourtGraphic graphic) {
		JMenuItem newGame = new JMenuItem("New Game");
		newGame.addActionListener(graphic);
		JMenuItem quit = new JMenuItem("Quit");
		quit.addActionListener(graphic);
		JMenu menu = new JMenu("Game");
		JMenuBar menuBar = new JMenuBar();
		
		menu.add(newGame);
		menu.addSeparator();
		menu.add(quit);
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);
	}
}
