
public class DemoApp {

	public static void main(String[] args) {
		Contribuabil c1 = new Contribuabil("Ion Popescu","5020305040224");
		Proprietate p1 = new Cladire("V. Parvan","2",20);
		Proprietate p2 = new Teren("V. Parvan","2",10,Rang.I);
		Proprietate p3 = new Cladire("Lugoj", "4",25);
		c1.declaraProprietate(p1);
		c1.declaraProprietate(p2);
		c1.declaraProprietate(p3);
		System.out.println(c1);
		
	}

}
