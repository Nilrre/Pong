package edu.neumont.csc150.Ball;

public class Ball {
	private int x, y, height, width, xVel, yVel;
	
	public Ball(){}
	
	public Ball(int x, int y, int height, int width, int xVel, int yVel){
		this.setX(x);
		this.setHeight(height);
		this.setWidth(width);
		this.setxVel(xVel);
		this.setY(y);
		this.setyVel(yVel);
	}
	
	/**
	 * Detects collision of the ball to an object
	 * @param rObjX
	 * @param rObjY
	 * @param lObjX
	 * @param lObjY
	 */
	public void detectCollision(int rObjX, int rObjY, int lObjX, int lObjY) {
		if(this.x >= rObjX - this.width || this.x < lObjX) {
			this.xVel *= -1;
		}
		if(this.y >= lObjY - this.height || this.y < lObjY) {
			this.yVel *= -1;
		}
	}
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * @return the xVel
	 */
	public int getxVel() {
		return xVel;
	}
	/**
	 * @param xVel the xVel to set
	 */
	public void setxVel(int xVel) {
		this.xVel = xVel;
	}
	/**
	 * @return the yVel
	 */
	public int getyVel() {
		return yVel;
	}
	/**
	 * @param yVel the yVel to set
	 */
	public void setyVel(int yVel) {
		this.yVel = yVel;
	}
}
