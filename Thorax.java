package drawingTool;

import java.awt.Color;
import java.awt.Graphics;

public class Thorax {

	private int width, height;
	private int x, y;
	
	
	 public Thorax(int x, int y, int width, int height) {
			this.x = x;
	        this.y = y;
	        this.width = width;
	        this.height = height;
	}
	 public void draw(Graphics pen) {
		 pen.setColor(Color.decode("#3d3fec"));
		 pen.fillOval(x, y, width, height);
		
	 }
}
