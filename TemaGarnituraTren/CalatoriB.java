
public class CalatoriB extends Calatori{
	private boolean windows=true;
	
	public CalatoriB() {
		super(50,400);
	}
	
	public void closeWindows() {
		if(windows) {
			windows=false;
			System.out.println("Geamurile s-au blocat");
		}
		else {
			windows=true;
			System.out.println("Geamurile s-au deblocat");
		}
	}
	
}
