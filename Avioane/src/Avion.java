
public class Avion {

	private String planeID;

	public int totalEnginePower;
	
	public String getPlaneID() {
		return planeID;
	}

	public int getTotalEnginePower() {
		return totalEnginePower;
	}

	
	public Avion(String planeID, int totalEnginePower) {
		this.planeID = planeID;
		this.totalEnginePower = totalEnginePower;
	}

	public void takeOff() {
		try {
			System.out.print(planeID);
			Thread.sleep(100);
			System.out.print(" - Initiating takeoff procedure");
			Thread.sleep(1000);
			System.out.print(" - Starting engines");
			Thread.sleep(1000);
			System.out.print(" - Accelerating down the runway");
			Thread.sleep(1000);
			System.out.print(" - Taking off");
			Thread.sleep(1000);
			System.out.print(" - Retracting gear");
			Thread.sleep(1000);
			System.out.println(" - Takeoff complete");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			Thread.currentThread().interrupt();
		}
	}
	
	public void land() {
		try {
			System.out.print(planeID);
			Thread.sleep(100);
			System.out.print(" - Initiating landing procedure");
			Thread.sleep(1000);
			System.out.print(" - Enabling airbrakes");
			Thread.sleep(1000);
			System.out.print(" - Lowering gear");
			Thread.sleep(1000);
			System.out.print(" - Contacting runway");
			Thread.sleep(1000);
			System.out.print(" - Decelerating");
			Thread.sleep(1000);
			System.out.print(" - Stopping engines");
			Thread.sleep(1000);
			System.out.println(" - Landing complete");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			Thread.currentThread().interrupt();
		}
	}
	
	public void fly() {
		System.out.println(planeID +" - Flying");
	}
}

