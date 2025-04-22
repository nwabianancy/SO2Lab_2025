package drawingTool;

import java.awt.Color;

public class Wing {
	private int height;
	private int width;
	
	public Wing(int headSize) {
	this.height = (int)(headSize*0.3); 
	this.width = (int)(headSize * 2);     
	}
 public void drawAt(int left, int bottom) {
	int halfWidth = width/2;
    int halfHeight = height/2;
    Drawing.pen.setColor(Color.decode("#55e1ff"));
	Drawing.pen.fillOval(left - halfWidth, bottom + halfHeight, width, height);
	 // Draw black outline
    Drawing.pen.setColor(Color.BLACK);
    Drawing.pen.drawOval(left - halfWidth, bottom + halfHeight, width, height);
	
 	}
 
}
