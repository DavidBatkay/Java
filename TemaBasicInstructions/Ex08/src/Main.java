import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.print("Introduceti n= ");
		int n=input.nextInt();
		System.out.println();
		int factorial=1;
		for(int i=2;i<=n;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("Factorial de "+n+" = "+factorial);
		
	}
	
}
