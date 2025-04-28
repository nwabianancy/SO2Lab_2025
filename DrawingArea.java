package drawingTool;

//import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingArea extends JPanel {
	private static final long serialVersionUID = 1L;
	private Dragonfly myDragonfly;
	private Dragonfly newDragonfly;
	
	public DrawingArea() {
        myDragonfly = new Dragonfly(59);
        newDragonfly = new Dragonfly(80);
    }
	

	protected void paintComponent(Graphics pen) {
		super.paintComponent(pen);
		Drawing.set(pen);
		
		myDragonfly.draw(300,600);
		newDragonfly.draw(1000,600);
	
		
		/*
		 * pen.drawLine(100, 100, 800, 800);
		 * 
		 * pen.setColor(Color.blue); // a color constant pen.drawRect(10, 10, 200, 300);
		 * 
		 * pen.setColor(Color.decode("#7a5230")); // HEX representation
		 * pen.fillOval(300, 234, 800, 100);
		 * 
		 * pen.setColor(new Color(255,100,100)); // RGB representation
		 * pen.drawString("Hello World", 666, 280);
		 */
		
		
		/*
		 * pen.setColor(Color.green);//sets pen color to green int[] xPoints = {400,
		 * 345, 365, 435, 455};// X coordinates of our polygon int[] yPoints = {200,
		 * 241, 310, 310, 241};//Y coordinates of our polygon int nPoints = 5; // number
		 * of sides that our polygon has it must correspond with your x and y
		 * coordinates pen.fillPolygon(xPoints, yPoints, nPoints);// draws and fills our
		 * polygon
		 */	}
}
