import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Minge {

	private int x,y;

	public Minge(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void suteaza(int x, int y) throws Gol, Corner, Out{
		this.x=x;
		this.y=y;
		checkBallPosition();
	}
	
	public void suteaza() throws Gol, Corner, Out{
		this.x= ThreadLocalRandom.current().nextInt(0,101);
		this.y = ThreadLocalRandom.current().nextInt(0,51);
		checkBallPosition();
	}
	
	public void checkBallPosition() throws Out, Gol, Corner {
		if(this.y<=0 || this.y>=50)
			throw new Out();
		if(this.x<=0 || this.x>=100) {
			if(this.y>=20 && this.y<=30)
				throw new Gol();
			else
				throw new Corner();
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public String toString() {
		return "("+this.getX()+","+this.getY()+")";
	}
	
}
