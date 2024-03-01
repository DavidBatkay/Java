
public class Birou extends Object {
	
	private Sertar x1,x2;
	
	public Birou(Sertar a, Sertar b) {
		x1=a;
		x2=b;
	}
	
	public void tipareste()
	{
		System.out.println("Componentele biroului sunt:");
		x1.tipareste();
		x2.tipareste();
	}
	
	
	
}
