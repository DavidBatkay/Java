package packagePerson;

public class Angajat {
	private int salary, yearsOfEmployment;
	private String firstName, lastName,role;
	public Angajat(int salary, int yearsOfEmployment, String firstName, String lastName) {
		this.yearsOfEmployment = yearsOfEmployment;
		this.salary = salary;
		this.salary = calculateSalary();
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = this.getClass().getSimpleName();
	}
	public int calculateSalary() {
		int calculatedSalary = this.salary+this.yearsOfEmployment*(this.salary/10);
		return calculatedSalary;
	}
	public int getSalary() {
		return this.salary;
	}
	
	public String getRole() {
		return this.role;
	}
	
	public String toString() {
		return this.firstName+" "+this.lastName+" ("+this.role+")";
	}
	
}
