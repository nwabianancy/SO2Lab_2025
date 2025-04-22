package drawingTool;

import java.awt.Color;

public class Abdomen {
	private int height;
	private int width;
	
	public Abdomen(int headSize) {
	this.height = headSize * 2; 
	this.width = (int)(headSize * 0.5);     
	}
 public void drawAt(int left, int bottom) {
	int halfWidth = width/2;
    int halfHeight = height/2;
    Drawing.pen.setColor(Color.decode("#ff88d5"));
	Drawing.pen.fillOval(left - halfWidth, bottom + halfHeight, width, height);
	 // Draw black outline
    Drawing.pen.setColor(Color.BLACK);
    Drawing.pen.drawOval(left - halfWidth, bottom + halfHeight, width, height);
	
 	}
 
}
