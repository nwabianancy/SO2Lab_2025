package drawingTool;

import java.awt.Color;
import java.awt.Graphics;

public class Head {
	private int width, height;
	private int x, y;
	private Eye eye;
	private mouth mouth;
	
	 public Head(int x, int y, int width, int height) {
			this.x = x;
	        this.y = y;
	        this.width = width;
	        this.height = height;
	}


	/*
	 * public void drawAt(int left, int bottom) { int x = left; int y = bottom -
	 * height; Drawing.pen.fillOval(x, y, width, width); }
	 */


	 public void draw(Graphics pen) {
		 pen.setColor(Color.decode("#f7abe9"));
		 pen.fillOval(x, y, width, height);
		 mouth.drawAt();
		 eye.drawAt();
		
	 }
	   }

