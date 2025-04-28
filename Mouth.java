package drawingTool;

import java.awt.Color;

public class Mouth {
	private int width;
    private int height;
    private int startAngle;
    private int arcAngle;

    public Mouth(int width, int height, int startAngle, int arcAngle) {
        this.width = width;
        this.height = height;
        this.startAngle = startAngle;
        this.arcAngle = arcAngle;
       
	}
	public void drawAt(int left, int bottom) {
		Drawing.pen.drawArc(left, bottom, width, height, startAngle, arcAngle);
	}
}
