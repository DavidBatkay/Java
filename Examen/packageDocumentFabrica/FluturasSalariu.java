package packageDocumentFabrica;

import packagePerson.Angajat;

public class FluturasSalariu extends Act {
	private int salary;
	private Angajat angajat;
	
	public FluturasSalariu(int salary, Angajat angajat) {
		super();
		this.salary = salary;
		this.angajat = angajat;
	}
	
	public String toString() {
		return this.getClass().getSimpleName()+" ID: "+this.getId()+" "+this.angajat+" "+this.angajat.getSalary();
	}
	
}
