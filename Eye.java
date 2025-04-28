package drawingTool;

public class Eye {
	private int width;
    private int height;
    private int startAngle;
    private int arcAngle;
	
	public Eye(int width, int height, int startAngle, int arcAngle){
		this.width = width;
        this.height = height;
        this.startAngle = startAngle;
        this.arcAngle = arcAngle;
	}

	public void drawAt(int left, int bottom) {
		Drawing.pen.drawArc(left, bottom, width, height, startAngle, arcAngle);
		
	}

}
