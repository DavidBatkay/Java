import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Greutate gs1= new GreutateSimpla(10);
		Greutate gs2 = new GreutateSimpla(10);
		Greutate gd1= new GreutateDubla(gs1,gs2);
		ArrayList<Greutate> lista= new ArrayList<Greutate>();
		lista.add(gs1);
		lista.add(gs2);
		lista.add(gd1);
		Greutate gm1= new GreutateMultipla(lista);
		ArrayList<Greutate> sala= new ArrayList<Greutate>();
		sala.add(gm1);
		sala.add(gs1);
		ColectieGreutati gym = new ColectieGreutati(sala);
		System.out.println(gym.medie());
	}

}
