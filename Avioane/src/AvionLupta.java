
public class AvionLupta extends Avion {

	public AvionLupta(String planeID, int totalEnginePower) {
		super(planeID, totalEnginePower);
		
	}
	
	public void launchMissile() {
		try {
			System.out.print(this.getPlaneID());
			Thread.sleep(100);
			System.out.print(" - Initiating missile launch procedure");
			Thread.sleep(1000);
			System.out.print(" - Aquiring target");
			Thread.sleep(1000);
			System.out.print(" - Launching missile");
			Thread.sleep(1000);
			System.out.print(" - Breaking away");
			Thread.sleep(1000);
			System.out.println(" - Missile launch complete");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			Thread.currentThread().interrupt();
		}
	}
	
	public void highSpeedGeometry() {
		if(this.getPlaneID().equals("Mig")) {
			try {
				System.out.print(this.getPlaneID());
				Thread.sleep(100);
				System.out.println(" - High speed geometry selected");

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				Thread.currentThread().interrupt();
			}
		}else System.err.println("High speed geometry function failed!"+" - Only Mig airplanes can use this function!");
	}
	
	public void normalGeometry() {
		if(this.getPlaneID().equals("Mig")) {
			try {
				System.out.print(this.getPlaneID());
				Thread.sleep(100);
				System.out.println(" - Normal geometry selected");

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				Thread.currentThread().interrupt();
			}
		}else System.err.println("Normal geometry function failed!"+" - Only Mig airplanes can use this function!");
	}
	
	public void refuel() {
		if(this.getPlaneID().equals("TomCat")) {
			try {
				System.out.print(this.getPlaneID());
				Thread.sleep(100);
				System.out.print(" - Initiating refueling procedure");
				Thread.sleep(1000);
				System.out.print(" - Locating refueller");
				Thread.sleep(1000);
				System.out.print(" - Catching up");
				Thread.sleep(1000);
				System.out.print(" - Refueling");
				Thread.sleep(1000);
				System.out.println(" - Refueling complete");

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				Thread.currentThread().interrupt();
			}
		}else System.err.println("Refuel function failed!"+" - Only TomCat planes can use this function!");
	}
}
