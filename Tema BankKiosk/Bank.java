import java.util.HashSet;

public class Bank {

	private HashSet<Client> bankClients;
	private String bankCode;
	
	public Bank(String bankCode) {
		this.bankCode = bankCode;
		this.bankClients = new HashSet<Client>();
	}
	
	public void add(Client c) {
		this.bankClients.add(c);
	}
	
	public boolean displayClientInformation(String clientName) {
		for(Client c : bankClients) {
			if(c.getName()==clientName) {
				System.out.println(c);
				for(BankAccount currentAccount : c.getBankAccounts()) {
					System.out.println(currentAccount.getSumTotal()+" "+currentAccount.getType());
				}
				return true;
			}	
		}
		return false;
		
	}
	
}
