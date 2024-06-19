package packagePerson;

import java.util.ArrayList;

public class Muncitor extends Angajat {
	
	private ArrayList<String> responsabilitati;
	
	public Muncitor(int salary, int yearsOfEmployment, String firstName, String lastName) {
		super(salary, yearsOfEmployment, firstName, lastName);
		responsabilitati = new ArrayList<String>();
	}
	
	public void addResponsability(String newResponsability) {
		this.responsabilitati.add(newResponsability);
	}
	public void removeResponsability(String newResponsability) {
		if(this.responsabilitati.contains(newResponsability)) {
			this.responsabilitati.remove(newResponsability);
		}
	}
}
