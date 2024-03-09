import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Introduceti n (n>1): ");
		int n=input.nextInt();
		System.out.println();
		boolean prim=true;
		if(n<=1) System.out.println("Numarul nu indeplineste conditia");
		else 
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0) {
					prim=false;
					break;
				}
				prim=true;
			}
		}
		if(prim)
			System.out.println("Numarul este prim");
		else System.out.println("Numarul nu este prim");
	}

}
