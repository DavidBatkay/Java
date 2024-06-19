package packageFabrica;

import packagePerson.Client;
import packagePerson.Manager;
import packagePerson.Muncitor;

public class Main {

	public static void main(String[] args) {
		Fabrica f1 = new Fabrica();
		Muncitor m1 = new Muncitor(3000, 3, "David", "Batkay");
		f1.addEmployee(m1);
		m1.addResponsability("Repair defective machines");
		Manager ma1 = new Manager(5000, 10, "Pavel", "Pavlov");
		f1.addEmployee(ma1);
		try {
			ma1.addSubordonate(m1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Client c1 = new Client("Pirelli");
		f1.generateOffer(20000, c1);
		try {
			f1.sendFluturasSalariu(m1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		f1.displayEmployees();
		f1.displayClients();
		f1.displayDocuments();
		f1.fireEmployee(m1);
		try {
			f1.sendFluturasSalariu(m1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
