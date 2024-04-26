
public abstract class Calatori extends Vagon {
	public Calatori(int capacitate_pasageri, int capacitate_colete) {
		super(capacitate_pasageri,capacitate_colete);
	
	}
	
	public void closeDoors() {
		System.out.println("Usile vagonului s-au inchis!");
	}
	
	public void openDoors() {
		System.out.println("Usile vagonului s-au deschis!");
	}
}
