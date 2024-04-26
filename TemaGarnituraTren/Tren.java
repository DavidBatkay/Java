import java.util.HashSet;
import java.util.LinkedList;

public class Tren {
	private LinkedList<Vagon> vagoane_atasate;
	private String cod;

	public Tren(String cod) {
		this.vagoane_atasate= new LinkedList<Vagon>();
		this.cod=cod;
	}
	
	public Tren(String cod,LinkedList<Vagon> vagoane_toAttach) {
		if(vagoane_toAttach.size()<=15) {
		this.vagoane_atasate= vagoane_toAttach;
		}
		else {
			throw new IllegalArgumentException("Nu se poate crea un tren cu mai mult de 15 vagoane atasate!");
		}
		this.cod=cod;
	}
	
	public boolean addVagon(Vagon new_vagon) {
		if(this.vagoane_atasate.size()<15) {	
			this.vagoane_atasate.addLast(new_vagon);
			return true;
		}
		System.err.println("Trenul nu poate avea atasate mai mult de 15 vagoane!");
		return false;
	}
	
	public String toString() {
		String vagoane ="Trenul: "+this.cod+" cu Vagoanele:";
		int index=1;
		for(Vagon current_vagon : vagoane_atasate) {
			
			vagoane+=" ["+index+"] "+current_vagon+" ";
			index++;
		}
		return vagoane;
	}
	
	public int sumOfColete() {
		int sum=0;
		for(Vagon current_vagon : vagoane_atasate) {
			sum+=current_vagon.getCapacitate_colete();
		}
		return sum;
	}
	
	public boolean equals(Tren tren_toCompare) {
		if(this.sumOfColete()==tren_toCompare.sumOfColete())
			return true;
		return false;
	}
	
	public HashSet<String> tipuriDeVagoane() {
		HashSet<String> tipuri = new HashSet<String>();
		for(Vagon current_vagon : vagoane_atasate) {
			tipuri.add(current_vagon.getClass().getTypeName());
		}
		return tipuri;
	}
	
	
}
