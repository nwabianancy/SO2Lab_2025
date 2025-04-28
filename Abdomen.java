package drawingTool;

import java.awt.Color;

public class Abdomen {
	private int height;
	private int width;
	private Stripes abdomenStripe;
	
	public Abdomen(int headSize) {
	this.height = headSize * 2; 
	this.width = (int)(headSize * 0.5);  
	abdomenStripe = new Stripes();
	
	}
 public void drawAt(int left, int bottom) {
	
    Drawing.pen.setColor(Color.decode("#ff88d5"));
	Drawing.pen.fillOval(left, bottom , width, height);
	 // Draw black outline
    Drawing.pen.setColor(Color.BLACK);
    Drawing.pen.drawOval(left, bottom, width, height);
    abdomenStripe.drawAt(left, bottom);
	
 	}
 
}
