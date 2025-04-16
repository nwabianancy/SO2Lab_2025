package drawingTool;

import java.awt.Graphics;

public class Dragonfly {
	private Head head;
	private Thorax thorax;
	//private Mouth mouth;
	
	public Dragonfly(int x, int y,int width, int height) {
		
		 head= new Head(x,y, width, height);
		 thorax= new Thorax(x,y, width, height);
	}
	
	/*
	 * public void drawAt(int left, int bottom) { head.drawAt(left, bottom);
	 * 
	 * 
	 * }
	 */

		public void draw(Graphics pen) {
			head.draw(pen);
			thorax.draw(pen);
			
		}

		
}
