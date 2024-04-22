
public class GreutateSimpla extends Greutate {

	private int capacitate;
	public GreutateSimpla(int capacitate) {
		this.capacitate=capacitate;
	}
	
	public int getCapacitate() {
		return capacitate;
	}

	public void setCapacitate(int capacitate) {
		this.capacitate = capacitate;
	}

	@Override
	public int capacitate() {
		return this.capacitate;
	}

}
