package drawingTool;

public class Leg {
	private int height;
	private int width;
	private int startAngle;
    private int arcAngle;
	
	public Leg(int width, int height, int startAngle, int arcAngle) {
		this.height= height;
		this.width = width;
		this.startAngle = startAngle;
        this.arcAngle = arcAngle;
	}
	public void drawAt(int left, int bottom) {
		Drawing.pen.drawArc(left, bottom, width, height, startAngle, arcAngle);
	}
}
