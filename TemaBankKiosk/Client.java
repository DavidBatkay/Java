import java.util.HashSet;

public class Client {

	private String name;
	private String address;
	private HashSet<BankAccount> bankAccounts;
	
	public Client(String name, String address) {
		this.name = name;
		this.address = address;
		this.bankAccounts= new HashSet<BankAccount>();
	}
	
	
	public String getName() {
		return name;
	}


	public String getAddress() {
		return address;
	}


	public HashSet<BankAccount> getBankAccounts() {
		return bankAccounts;
	}


	public boolean addAccount(BankAccount newAccount) {
		if(this.bankAccounts.size()<5)
			return this.bankAccounts.add(newAccount);
		System.err.println("Client cannot have more than 5 bank accounts!");
		return false;
	}
	
	public boolean equals(Client c) {
		if(this.getName()==c.getName())
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		String stringToReturn = "Name: "+this.getName()+" , Address: "+this.getAddress();
		return stringToReturn;
	}
	
}
