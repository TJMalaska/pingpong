package pong;

import java.awt.Rectangle;


public class Ball extends Rectangle {
	int dX, dY;
	int scoreLeft = 0;
    int scoreRight=0;
	
	public Ball(int w, int h) {
		super (640, 430, w, h);
		dX=5;
		dY=5;
	}
	public void move() {
		this.x = this.x + dX;
		this.y = this.y + dY;
		if (this.y >= Pong.getMaxWindowY()) {
			this.dY = -this.dY;
		}
		if (this.y <=0) {
			this.dY =-this.dY;
		}
		if(this.x+this.width >= Pong.getMaxWindowX()) {
			this.dX = -this.dX;
			scoreRight ++;
		}
		if (this.x <=0) {
			this.dX=-this.dX;
		}
		
	}

}
