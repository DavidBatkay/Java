
public abstract class Proprietate {
	private String adresa;
	private String strada;
	private String numar;
	private int suprafata;
	private int cost;

	public Proprietate(String strada,String numar, int suprafata, int cost) {
		this.adresa = "Strada "+strada+" Nr. "+numar;
		this.suprafata = suprafata;
		this.cost = cost;
		this.strada = strada;
		this.numar = numar;
	}

	public int getCost() {
		return this.cost*this.suprafata;
	}
	
	public String getAdresa() {
		return adresa;
	}

	public String getStrada() {
		return strada;
	}

	public String getNumar() {
		return numar;
	}

	public int getSuprafata() {
		return suprafata;
	}

	public abstract int getCostTaxa();
	
	public String toString() {
		return this.getClass().getName()+":"+System.lineSeparator()+"\t"+this.adresa+System.lineSeparator()+"\t"+
	"Suprafata: "+this.suprafata+" mp"+System.lineSeparator()+"\t"+"Cost: "+this.getCost()+System.lineSeparator();
	}
}
