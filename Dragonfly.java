package drawingTool;

/*import java.awt.Color;
import java.awt.Graphics;*/

public class Dragonfly {
	private Head head;
	private Thorax thorax;
	private Abdomen abdomen;
	
	private int baseSize;
	
	public Dragonfly(int baseSize) {
		this.baseSize = baseSize;
		 head = new Head(baseSize);
		 thorax = new Thorax(head.getSize());
		 abdomen = new Abdomen(head.getSize());
			
	}

		public void draw(int left, int bottom) {
			//I feel these are magic numbers and that it would be better to use division and multiplication with whole integers or floating numbers
			/*
			 * rightWing1.drawAt(left, bottom-270); rightWing2.drawAt(left, bottom-300);
			 * leftWing1.drawAt(left-200, bottom-270); leftWing2.drawAt(left-200,
			 * bottom-300);
			 */
			abdomen.drawAt(left +2 , bottom - baseSize * 3);
			head.drawAt(left-13, bottom - baseSize*5 );//450
			thorax.drawAt(left -4, bottom- baseSize * 4);	
			
			
			
		}

		
}
