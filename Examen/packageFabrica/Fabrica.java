package packageFabrica;

import java.util.ArrayList;

import packageDocumentFabrica.Act;
import packageDocumentFabrica.FluturasSalariu;
import packageDocumentFabrica.Oferta;
import packagePerson.Angajat;
import packagePerson.Client;

public class Fabrica {
	private ArrayList<Angajat> angajati;
	private ArrayList<Client> clienti;
	private ArrayList<Act> acte;
	
	public Fabrica() {
		this.angajati = new ArrayList<Angajat>();
		this.clienti = new ArrayList<Client>();
		this.acte = new ArrayList<Act>();
	}
	
	public void addEmployee(Angajat x) {
		this.angajati.add(x);
	}
	public void fireEmployee(Angajat x) {
		this.angajati.remove(x);
	}
	public void displayEmployees() {
		for(Angajat employee : this.angajati) {
			System.out.println(employee);
		}
	}
	public void addClient(Client newClient) {
		this.clienti.add(newClient);
	}
	public void displayClients() {
		for(Client client : this.clienti)
			System.out.println(client);
	}
	public void generateOffer(int totalValue, Client client) {
		Oferta newOferta = new Oferta(totalValue, client);
		this.acte.add(newOferta);
	}
	public void sendFluturasSalariu(Angajat angajat) throws Exception {
		if(this.angajati.contains(angajat)) {
			this.acte.add(new FluturasSalariu(angajat.getSalary(), angajat));
		}
		else throw new Exception("This employee has been fired!");
	}
	public void displayDocuments() {
		for(Act act : this.acte) {
			System.out.println(act);
		}
	}
}
