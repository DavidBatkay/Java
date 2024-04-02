
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalEnginePower = 2000;
		int maxPassengers = 10;
		
		AvionLupta Mig = new AvionLupta("Mig", totalEnginePower);
		AvionCalatori Concorde = new AvionCalatori("Concorde", totalEnginePower, maxPassengers);
		AvionLupta TomCat = new AvionLupta("TomCat", totalEnginePower);
		Mig.takeOff();
		Mig.fly();
		Mig.launchMissile();
		Mig.refuel();
		Mig.highSpeedGeometry();
		Mig.land();
		///
		Concorde.takeOff();
		Concorde.fly();
		Concorde.goSuperSonic();
		Concorde.land();
		//
		TomCat.takeOff();
		TomCat.fly();
		TomCat.launchMissile();
		TomCat.refuel();
		TomCat.highSpeedGeometry();
		TomCat.land();
		
		System.out.println("Program finished!");
	}

}
