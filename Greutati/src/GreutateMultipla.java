import java.util.ArrayList;

public class GreutateMultipla extends Greutate {

	private ArrayList<Greutate> greutate;
	
	
	public GreutateMultipla(ArrayList<Greutate> greutate) {
		this.greutate = greutate;
	}
	
	public void insert(Greutate greutate) {
		this.greutate.add(greutate);
	}

	public ArrayList<Greutate> getGreutate() {
		return greutate;
	}

	public void setGreutate(ArrayList<Greutate> greutate) {
		this.greutate = greutate;
	}

	@Override
	public int capacitate() {
		int capacitate=0;
		for(Greutate e : greutate) {
			capacitate+=e.capacitate();
		}
		return capacitate;
	}

}
