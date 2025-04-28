package drawingTool;

import java.awt.Color;
/*import java.awt.Graphics;*/

public class Head {
    private int size;
    private Eye leftEye;
    private Eye rightEye;
    private Mouth mouth;
  
    public Head(int baseSize) {
        this.size = baseSize;
        
        int eyeWidth = size/4;
        int eyeHeight = size/5;
        int eyeArcStart = 0;
        int eyeArcAngle = 180;

        leftEye = new Eye(eyeWidth, eyeHeight, eyeArcStart, eyeArcAngle);
        rightEye = new Eye(eyeWidth, eyeHeight, eyeArcStart, eyeArcAngle);

        int mouthWidth = size/2;
        int mouthHeight = size/4;
        int mouthStart = 0;
        int mouthAngle = 180;

        mouth = new Mouth(mouthWidth, mouthHeight, mouthStart, mouthAngle);
    }

    

	public void drawAt(int left, int bottom) {
        
        
        Drawing.pen.setColor(Color.decode("#ff88d5"));
        Drawing.pen.fillOval(left, bottom, size, size); 
        Drawing.pen.setColor(Color.black);
        Drawing.pen.drawOval(left, bottom, size, size);
        
        //mouth.drawAt(left, bottom ); //- 10 bottom - 500
		
    }

  
    public int getSize() {
      return size; 
    }

		 
		
	 }
	   
