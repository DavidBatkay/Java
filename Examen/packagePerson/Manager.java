package packagePerson;

import java.util.ArrayList;

public class Manager extends Angajat {

	private ArrayList<Angajat> subordonates;
	
	public Manager(int salary, int yearsOfEmployment, String firstName, String lastName) {
		super(salary, yearsOfEmployment, firstName, lastName);
		this.subordonates=new ArrayList<Angajat>();
	}

	public void addSubordonate(Angajat x) throws Exception {
		if(x.getRole().equals("Manager")){
			throw new Exception("Cannot subordonate a manager to another manager!");
		}
		else this.subordonates.add(x);
	}
	public void removeSubordonate(Angajat x) throws Exception {
		if(this.subordonates.contains(x)){
			this.subordonates.remove(x);
		}
	}
}
