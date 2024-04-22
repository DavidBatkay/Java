
public class GreutateDubla extends Greutate {

	public Greutate greutate1, greutate2;
	
	public GreutateDubla(Greutate greutate1, Greutate greutate2) {
		this.greutate1 = greutate1;
		this.greutate2 = greutate2;
	}

	public Greutate getGreutate1() {
		return greutate1;
	}

	public void setGreutate1(Greutate greutate1) {
		this.greutate1 = greutate1;
	}


	public Greutate getGreutate2() {
		return greutate2;
	}


	public void setGreutate2(Greutate greutate2) {
		this.greutate2 = greutate2;
	}


	@Override
	public int capacitate() {
		return greutate1.capacitate()+greutate2.capacitate();
	}

}
