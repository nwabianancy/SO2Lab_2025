package drawingTool;

import java.awt.Color;

public class Thorax {
	private int height;
	private int width;
	private Wing leftForeWing;
	private Wing leftHindWing;
	private Wing rightForeWing;
	private Wing rightHindWing;
	private Leg leftFrontLeg;
	private Leg leftBackLeg;
	private Leg rightFrontLeg;
	private Leg rightBackLeg;

	public Thorax(int baseSize) {
		this.height = baseSize; 
		this.width = (int)(baseSize * 0.7);  
		
		int foreWingHeight = (int)(baseSize * 2);
		int foreWingWidth = (int)(baseSize * 0.3); 
        int hindWingHeight = (int)(baseSize * 1.5);
        int hindWingWidth =(int)(baseSize * 0.3);       
        
        leftForeWing = new Wing(foreWingWidth, foreWingHeight);
        rightForeWing = new Wing(foreWingWidth, foreWingHeight);
        leftHindWing = new Wing(hindWingWidth, hindWingHeight);
        rightHindWing = new Wing(hindWingWidth, hindWingHeight);
        
        int legWidth = baseSize / 2;
        int legHeight = baseSize;
        int startAngle = 0;// curve direction      
        int arcAngle = 60;    

        leftFrontLeg = new Leg(legWidth, legHeight, startAngle , arcAngle);
        rightFrontLeg = new Leg(legWidth, legHeight, startAngle, arcAngle);
        leftBackLeg = new Leg(legWidth, legHeight, startAngle, arcAngle);
        rightBackLeg = new Leg(legWidth, legHeight, startAngle, arcAngle);
		
	}
	 public void drawAt(int left, int bottom) {
		
			
		// Draw front legs (before wings)
	        //leftFrontLeg.drawAt(left - width, bottom + height/2);
	        //rightFrontLeg.drawAt(left + width/2, bottom + height/2);  
	        //leftBackLeg.drawAt(left - width/2, bottom - height/2);
	        //rightBackLeg.drawAt(left + width/2, bottom - height/2);
	        // Draw wings
	        leftForeWing.drawAt(left - width*2 , bottom);
	        rightForeWing.drawAt(left + width/2, bottom);
	        leftHindWing.drawAt(left - width*2, bottom + height/3);
	        rightHindWing.drawAt(left + width/2, bottom + height/3);
	        
		    Drawing.pen.setColor(Color.decode("#ff88d5"));
			Drawing.pen.fillOval(left, bottom, width, height);
			// Draw black outline
	        Drawing.pen.setColor(Color.BLACK);
	        Drawing.pen.drawOval(left, bottom , width, height);
        
	        
		
	 }
	 
}
