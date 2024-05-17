
public abstract class BankAccount implements SumTotal {

	private String accountNumber;
	private float sum;
	public BankAccount(String accountNumber, float sum) {
		this.accountNumber = accountNumber;
		this.sum = sum;
	}
	public float getSum() {
		return sum;
	}
	public void setSum(float sum) {
		this.sum = sum;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void transfer(BankAccount receiver,float sum) {
		if(this instanceof BankAccountLEI) {
		this.setSum(this.getSum()-sum);
		receiver.setSum(receiver.getSum()+sum);
		}
		else System.err.println("Only LEI Bank Accounts can use transfer function!");
	}
	
	public abstract String getType();

	@Override
	public String toString() {
		return this.getAccountNumber()+" , "+this.getSumTotal()+" "+this.getType();
	}
	
}
