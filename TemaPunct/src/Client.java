import java.awt.Color;

public class Client {

	public static void main(String[] args) {

		Color black = new Color(0, 0, 0);
		Punct a = new Punct(10,20);
		PunctColorat b = new PunctColorat(100,200, black);
		
		System.out.println(b.getX()+" "+b.getY());
		
	}

}
