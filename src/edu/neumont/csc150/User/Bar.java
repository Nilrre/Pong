package edu.neumont.csc150.User;

public class Bar {
	private int width;
	private int height;
	private int x;
	private int y;
	private int yVel;
	
	public Bar(){}
	
	public Bar(int x, int y, int height, int width){
		this.setHeight(height);
		this.setWidth(width);
		this.setX(x);
		this.setY(y);
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
