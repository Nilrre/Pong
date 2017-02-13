package edu.neumont.csc150.User;

public class Player extends Bar {
	private String name;
	private int score;
	
	public Player(){}
	
	public Player(int score){
//		this.setName(name);
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
