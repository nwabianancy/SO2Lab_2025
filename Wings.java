package drawingTool;

import java.awt.Color;

public class Wing {
	private int height;
	private int width;
	private Stripes wingStripe;
	
	public Wing(int height, int width) {
		this.height = height;
		this.width = width;
		wingStripe = new Stripes();  
	
	}
 public void drawAt(int left, int bottom) {
    Drawing.pen.setColor(Color.decode("#55e1ff"));
	Drawing.pen.fillOval(left , bottom , width, height);
    Drawing.pen.setColor(Color.BLACK);
    Drawing.pen.drawOval(left , bottom, width, height);
    
 	}
 
}
