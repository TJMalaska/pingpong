package pong;

import java.awt.Color;
import java.awt.Graphics2D;

import utilities.GDV5;

public class Pong extends GDV5 {
	
	Ball b1 = new Ball(20,20);
	Paddle p1= new Paddle(10,180);
	CP p2= new CP (20,180);
	
	
	public static void main(String[] args) {
		Pong p = new Pong();
		
		p.start();
	}

	@Override
	public void update() {
		// 60 fps refresh logic goes here
		b1.move();
		
	}

	@Override
	public void draw(Graphics2D win) {
		// refreshes at processor rate (3000 fps) drawing
		win.setColor(Color.GRAY);
		win.fill(b1);
		
		win.drawString("score", 500, 60);
		win.setColor(Color.BLUE);
		win.fill(p1);
		win.setColor(Color.RED);
		win.fill(p2);
		
		
	}

}
