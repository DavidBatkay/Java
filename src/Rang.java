
public enum Rang {
	I(1),
	II(2),
	III(3),
	IV(4);
	
	private int rang;
	
	private Rang(int rang) {
		this.rang=rang;
	}
	
	public int getRang() {
		return rang;
	}
	
}
