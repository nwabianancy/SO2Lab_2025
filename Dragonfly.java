package drawingTool;

import java.awt.Color;
import java.awt.Graphics;

public class Dragonfly {
	private Head head;
	private Thorax thorax;
	//private Mouth mouth;
	private Abdomen abdomen;
	private Wing leftWing1;
	private Wing leftWing2;
	private Wing rightWing1;
	private Wing rightWing2;
	
	public Dragonfly(int width, int height) {
		
		 head = new Head(100);
		 thorax = new Thorax(head.getSize());
		 abdomen = new Abdomen(head.getSize());
		 leftWing1 = new Wing(head.getSize());
		 leftWing2 = new Wing(head.getSize());
		 rightWing1 = new Wing(head.getSize());
		 rightWing2 = new Wing(head.getSize());
			
	}
	
	/*
	 * public void drawAt(int left, int bottom) { head.drawAt(left, bottom);
	 * 
	 * 
	 * }
	 */

		public void draw(Graphics pen) {
			rightWing1.drawAt(700, 300);
			rightWing2.drawAt(700, 330);
			leftWing1.drawAt(900, 300);
			leftWing2.drawAt(900, 330);
			abdomen.drawAt(800,280);
			head.drawAt(800,170);
			thorax.drawAt(800,250);
			
			
			
			
			
		}

		
}
