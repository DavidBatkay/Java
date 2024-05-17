
public class OpenSource extends Project{

	private final int MAX_MEMBERS=Integer.MAX_VALUE;
	private String mailing_list;
	public OpenSource(String title, String objective, Member manager, String mailing_list, long funds) {
		super(title, objective, manager, funds);
		this.mailing_list=mailing_list;
	}

	@Override
	public int getMAX_MEMBERS() {
		return this.MAX_MEMBERS;
	}

	@Override
	public double getRisk() {
		return this.getMembers().size()/this.getFunds();
	}

}
