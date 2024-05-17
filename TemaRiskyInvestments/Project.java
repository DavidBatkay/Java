import java.util.HashSet;

public abstract class Project implements Risky{
	private HashSet<Member> members;
	private Member manager;
	private String title;
	private String objective;
	private long funds;
	
	public Project(String title,String objective,Member manager,long funds) {
		this.objective = objective;
		this.title = title;
		this.manager = manager;
		this.funds=funds;
		this.members=new HashSet<Member>();
		this.addMember(manager);
	}
	
	public abstract int getMAX_MEMBERS();
	
	public void addMember(Member m) {
		if(this.getMAX_MEMBERS()>this.getMembers().size())
			this.members.add(m);
		else System.err.println("Cannot add members over the set limit!");
		
	}



	public HashSet<Member> getMembers() {
		return members;
	}



	public Member getManager() {
		return manager;
	}



	public String getTitle() {
		return title;
	}



	public String getObjective() {
		return objective;
	}



	public long getFunds() {
		return funds;
	}



	public int getMaxMembers() {
		return this.getMAX_MEMBERS();
	}
	
	@Override 
	public String toString() {
		return "Project:"+this.title+", TYPE:"+this.getClass().getName();
	}
	
	
}
