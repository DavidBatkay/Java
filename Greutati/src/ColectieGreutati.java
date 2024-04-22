import java.util.ArrayList;

public class ColectieGreutati {
	private ArrayList<Greutate> listaGreutati = new ArrayList<Greutate>();

	public ColectieGreutati(ArrayList<Greutate> listaGreutati) {
		this.listaGreutati = listaGreutati;
	}
	
	public ArrayList<Greutate> getListaGreutati() {
		return listaGreutati;
	}

	public void setListaGreutati(ArrayList<Greutate> listaGreutati) {
		this.listaGreutati = listaGreutati;
	}

	public void adauga(Greutate e) {
		this.listaGreutati.add(e);
	}
	public int medie() {
		int sum=0;
		for(Greutate e : listaGreutati) {
			sum+=e.capacitate();
		}
		int media=sum/listaGreutati.size();
		return media;
		
	}
}
