package edu.neumont.csc150.User;

import edu.neumont.csc150.Ball.Ball;

public class Player extends Bar {
	private String name;
	private int score;
	
	public Player() {
	}

	public Player(int score, int x, int y, int width, int height, int yvel) {
		this.setHeight(height);
		this.setWidth(width);
		this.setX(x);
		this.setY(y);
		this.setyVel(yvel);
		this.setScore(score);
	}
	
	public void paddleLeftCollision(Ball b, Player two) {
		if(b.getX() < this.getX()+this.getWidth()-10) {
			if(b.getY() > this.getY() && b.getY() < this.getY()+this.getHeight()){
				int speed = b.getxVel() * -1;
				b.setxVel(speed);
			}else if(b.getX() <= 0) {
				two.score++;
				b.setX(1250);
				b.setY(600);
			}
		}
	}

	public void paddleRightCollision(Ball b, Player one) {
		if(b.getX()+this.getWidth() >= this.getX()+9) {
			if(b.getY() > this.getY() && b.getY() < this.getY()+this.getHeight()){
				int speed = b.getxVel() * -1;
				b.setxVel(speed);
			}else if(b.getX() >= 2560) {
				one.score++;
				b.setX(1250);
				b.setY(600);
			}
		}		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
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
	 * @param score
	 *            the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
}
