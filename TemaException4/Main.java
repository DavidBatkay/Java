
public class Main {

	public static void main(String[] args) {
		Joc j1 = new Joc("ROU","HUN");
		Joc j2 = new Joc("ENG","GER");
		
		j1.simuleaza();
		j2.simuleaza();
		System.out.println(j1);
		System.out.println(j2);
		
	}

}
