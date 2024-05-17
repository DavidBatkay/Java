
public class BankAccountLEI extends BankAccount {
	
	private final static String TYPE="LEI";
	
	public BankAccountLEI(String accountNumber, float sum) {
		super(accountNumber, sum);
	}

	@Override
	public float getSumTotal() {
		return this.getSum();
	}
	

	@Override
	public String getType() {
		return TYPE;
	}

}
