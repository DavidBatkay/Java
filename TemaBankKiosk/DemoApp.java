
public class DemoApp {

	public static void main(String[] args) {

		Bank raiffeisen = new Bank("raiffeisenAG");
		BankAccount ba1 = new BankAccountLEI("555",0);
		BankAccount ba2 = new BankAccountEURO("556",490);
		BankAccount ba3 = new BankAccountLEI("557",500);
		Client c1 = new Client("David Batkay","Nufarul 87");
		Client c2 = new Client("Ezechiel Sandru","Nufarul 87");
		c1.addAccount(ba1);
		c1.addAccount(ba2);
		c2.addAccount(ba3);
		raiffeisen.add(c1);
		raiffeisen.add(c2);
		
		ba3.transfer(ba1, 500);
		raiffeisen.displayClientInformation("David Batkay");
		raiffeisen.displayClientInformation("Ezechiel Sandru");
	}

}
