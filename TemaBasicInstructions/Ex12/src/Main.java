import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Introduceti n= ");
		int n=input.nextInt();
		System.out.println();
		System.out.print("Toti divizorii primi al numarului "+n+" sunt: 1");
		for(int i=2;i<=n;i++)
		{
			if(n%i==0) 
			{
				boolean prim=true;
				for(int j=2;j<=i/2;j++)
				{
					if(i%j==0) {
						prim=false;
						break;
					}
					prim=true;
				}
				if(prim) System.out.print(" , "+i);
			}
		}
		System.out.print(" ;");
	}

}