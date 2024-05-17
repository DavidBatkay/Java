
public class Commercial extends Project{
	
	private String deadline;
	private final int MAX_MEMBERS=15;
	private int noOfTeams;
	private long marketingFunds;

	public Commercial(String title, String objective, Member manager,
			long funds, String deadline, int noOfTeams) {
		super(title, objective, manager, funds);
		this.deadline = deadline;
		checkNoOfTeams();
		this.noOfTeams = noOfTeams;
		this.marketingFunds = this.getFunds()/2;
}

	public int getMAX_MEMBERS() {
		return this.MAX_MEMBERS;
	}
	
	private void checkNoOfTeams() {
		if(noOfTeams>this.getMembers().size()) {
			throw new IllegalArgumentException("Cannot have more teams than members!");
			}
	}

	@Override
	public double getRisk() {
		return (this.noOfTeams*3)/this.getMembers().size()/
				(this.getFunds()-this.marketingFunds);
		
	}

}
