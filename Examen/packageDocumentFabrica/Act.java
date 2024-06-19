package packageDocumentFabrica;

public class Act {
	private static int id=1;
	private int actId;
	public Act() {
		this.actId = this.id;
		id++;
	}
	
	public int getId() {
		return this.actId;
	}
}
