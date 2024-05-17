
public class BankAccountEURO extends BankAccount{

	private float interest;
	private final static String TYPE = "EURO";

	public BankAccountEURO(String accountNumber, float sum) {
		super(accountNumber, sum);
		this.interest=getInterest();
	}

	public float getInterest() {
		if(this.getSum()>500)
			this.interest = 0.3f;
		else this.interest = 0f;
		return this.interest;
	}

	@Override
	public float getSumTotal() {
		return this.getSum()/3.6000f;
	}

	@Override
	public String getType() {
		return TYPE;
	}
	

}
