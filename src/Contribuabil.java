import java.util.ArrayList;

public class Contribuabil {
	private ArrayList<Proprietate> lista_proprietati = new ArrayList<Proprietate>();
	private String name;
	private String cnp;
	
	public Contribuabil(String name,String cnp) {
		this.name = name;
		this.cnp = cnp;
	}
	
	public void declaraProprietate(Proprietate noua_proprietate) {
		this.lista_proprietati.add(noua_proprietate);
	}
	
	public String toString() {
		int taxeTotal=0;
		String toReturn1 = "Contribuabil: "+this.name+System.lineSeparator()+"CNP: "+this.cnp+System.lineSeparator()+System.lineSeparator();
		String toReturn2 = "Proprietati"+System.lineSeparator();
		for(Proprietate p : lista_proprietati) {
			toReturn2+="    "+p.toString();
			taxeTotal+=p.getCostTaxa();
		}
		String toReturn3=(System.lineSeparator()+"Suma totala: "+ taxeTotal);
		return toReturn1+toReturn2+toReturn3;
	}
	
	
}
