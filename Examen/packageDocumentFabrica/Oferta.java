package packageDocumentFabrica;

import packagePerson.Client;

public class Oferta extends Act {
	private int totalValue;
	private Client client;
	public Oferta(int totalValue, Client client) {
		super();
		this.totalValue = totalValue;
		this.client = client;
	}
	public int getTotalValue() {
		return totalValue;
	}
	public Client getClient() {
		return client;
	}
	public String toString() {
		return this.getClass().getSimpleName()+" ID: "+this.getId()+" "+this.client;
	}
	
	
}
