
public class AvionCalatori extends Avion {

	private int maxpassengers;

	public int getMaxpassengers() {
		return maxpassengers;
	}

	public AvionCalatori(String planeID, int totalEnginePower, int maxpassengers) {
		super(planeID, totalEnginePower);
		this.maxpassengers = maxpassengers;
	}
	
	public void goSuperSonic() {
		if(this.getPlaneID().equals("Concorde")) {
			try {
				System.out.print(this.getPlaneID());
				Thread.sleep(100);
				System.out.println(" - Supersonic mode activated");

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				Thread.currentThread().interrupt();
			}
		}else System.err.println("Go supersonic function failed!"+" - Only Concorde airplanes can use this function!");
	}
	
	public void goSubSonic() {
		if(this.getPlaneID().equals("Concorde")) {
			try {
				System.out.print(this.getPlaneID());
				Thread.sleep(100);
				System.out.println(" - Supersonic mode deactivated");

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				Thread.currentThread().interrupt();
			}
		}else System.err.println("Go subsonic function failed!"+" - Only Concorde airplanes can use this function!");

	}

}
