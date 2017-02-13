package edu.neumont.csc150.User;

public class Player extends Bar {
	private String name;
	private int score;
	
	public Player(){}
	
	public Player(int score, int x, int y, int width, int height, int yvel){
		this.setHeight(height);
		this.setWidth(width);
		this.setX(x);
		this.setY(y);
		this.setyVel(yvel);
		this.setScore(score);
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
}
