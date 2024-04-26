
public class Main {

	public static void main(String[] args) {

		Tren tren1 = new Tren("123");
		Vagon a = new CalatoriA();
		Vagon b = new CalatoriB();
		Vagon x = new Marfa();
		tren1.addVagon(a);
		tren1.addVagon(b);
		tren1.addVagon(x);
		
		Tren tren2 = new Tren("321");
		tren2.addVagon(a);
		tren2.addVagon(b);
		tren2.addVagon(x);

		System.out.println(tren1.equals(tren2));
		
		System.out.println(tren1.tipuriDeVagoane());
		((CalatoriB)b).closeWindows(); //cum fac sa nu fie nevoie de cast?
	}

}
