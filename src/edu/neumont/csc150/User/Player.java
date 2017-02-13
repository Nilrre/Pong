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

	public void paddleLeftCollision(Ball b) {
		if (b.getX() + b.getxVel() < this.getX() + this.getWidth() + 10
				|| b.getX() + b.getxVel() < this.getX() + this.getWidth() - 10) {
			if (b.getY() + b.getyVel() >= this.getY() && b.getY() + b.getyVel() <= this.getHeight() + this.getY()
					&& !(b.getX() < this.getX() + 10)) {
				int speed = b.getxVel() * -1;
				b.setxVel(speed);
			}
		} else if (b.getX() < 0) {
			score++;
			b.setX(1250);
			b.setY(600);
		}
	}

	public void paddleRightCollision(Ball b) {
		if (b.getX() + b.getWidth() >= this.getX() - 10 || b.getX() + b.getWidth() >= this.getX() + 10) {
			if (b.getY() - b.getHeight() + b.getyVel() >= this.getY()
					&& b.getY() - b.getyVel() <= this.getHeight() + this.getY() && !(b.getX() > this.getX() + 10)) {
				int speed = b.getxVel() * -1;
				b.setxVel(speed);
			} else if (b.getX() > 2560) {
				score++;
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
