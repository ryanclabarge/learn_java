public class Mouse {
	public static void main(String[] args) {
		StdDraw.enableDoubleBuffering();
		while (true) {
			//Sets the color to cyan if the button on the mouse is pressed.
			if (StdDraw.isMousePressed())	StdDraw.setPenColor(StdDraw.CYAN);
			else				StdDraw.setPenColor(StdDraw.BLUE);
			//Finds the coordinates for the mouse and draws a circle around it
			StdDraw.clear();
			double x = StdDraw.mouseX();
			double y = StdDraw.mouseY();
			StdDraw.filledCircle(x,y,0.05);
			StdDraw.show();
			//Pauses for 10 seconds between iterations
			StdDraw.pause(10);
		}
	}
}
