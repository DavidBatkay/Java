import java.awt.Color;
import javax.swing.JFrame;

public class Client {

	public static void main(String[] args) {

		Color black = new Color(0, 0, 0);
		Punct a = new Punct(10,20);
		PunctColorat b = new PunctColorat(100,200, black);
		
		System.out.println(b.getX()+" "+b.getY());
		
		JFrame frame = new JFrame();
        frame.setSize(300, 200);
        frame.getContentPane().setBackground(new Color(255, 0, 0));
        frame.setVisible(true);
	}

}
