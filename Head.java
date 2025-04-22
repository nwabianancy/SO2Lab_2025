package drawingTool;

import java.awt.Color;
import java.awt.Graphics;

public class Head {
    private int size;
  
    public Head(int size) {
        this.size = size;
    }

    public void drawAt(int left, int bottom) {
        int halfTheSize = size/2;
        int x = left - halfTheSize; 
        int y = bottom + halfTheSize;
        Drawing.pen.setColor(Color.decode("#ff88d5"));
        Drawing.pen.fillOval(x, y, size, size); 
        Drawing.pen.setColor(Color.black);
        Drawing.pen.drawOval(x, y, size, size);
		//mouth.drawAt();
		//eye.drawAt();
    }

  
    public int getSize() {
      return size; 
    }

		 
		
	 }
	   
