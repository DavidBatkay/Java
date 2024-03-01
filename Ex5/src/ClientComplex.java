
public class ClientComplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex(3,7);
		//c1.afisareComplex();
		//System.out.println(c1.modulComplex());
		Complex c2=new Complex(2, 5.4);
		
		Complex suma=c1.suma(c2);
		suma.afisareComplex();
		Complex.numarAfisari();
	}

}
