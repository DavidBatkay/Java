
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sertar a= new Sertar();
		Sertar b= new Sertar(3,1,2);
		//a.tipareste();b.tipareste();
		Birou x= new Birou(a,b);
		x.tipareste();
	}

}
