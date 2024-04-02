import java.awt.Color;

public class PunctColorat extends Punct {

	private Color c;
	
	public PunctColorat(int x, int y, Color color) {
		super(x,y);
		this.c = color;	
	}

	public Color getColor() {
		return c;
	}
	
}
