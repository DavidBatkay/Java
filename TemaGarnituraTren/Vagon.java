
public abstract class Vagon {
	
	private int capacitate_pasageri;
	private int capacitate_colete;
	
	public Vagon(int capacitate_pasageri, int capacitate_colete) {
		this.capacitate_pasageri = capacitate_pasageri;
		this.capacitate_colete = capacitate_colete;
	}

	public int getCapacitate_pasageri() {
		return capacitate_pasageri;
	}

	public int getCapacitate_colete() {
		return capacitate_colete;
	}
	
	public String toString() {
		return "Pasageri: "+this.capacitate_pasageri+", Colete: "+this.capacitate_colete;
	}
	
}
