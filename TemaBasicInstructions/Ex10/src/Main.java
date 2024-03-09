import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1000;
		boolean prim=false;
		
		while(prim==false)
		{
			prim=true;
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0) {
					prim=false;
					n++;
				}
			}
		}
			System.out.println("Cel mai mic numar prim dupa 1000 ="+n);
	}

}