
public class Military extends Project {

	private final int MAX_MEMBERS=15;
	private String password;
	
	public Military(String title, String objective, Member manager, long funds, String password) {
		super(title, objective, manager, funds);
		this.password = password;
	}

	@Override
	public int getMAX_MEMBERS() {
		return this.MAX_MEMBERS;
	}

	@Override
	public double getRisk() {
		return this.getMembers().size()/this.password.length()/this.getFunds();
	}

}
