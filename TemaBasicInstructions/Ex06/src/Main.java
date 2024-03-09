import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Cate numere sa se adune?");
		int n= input.nextInt();
		int suma=0;
		for(int i=0;i<n;i++)
		{
			System.out.println("Introduceti numere (numere impare:"+i+"/"+n+"):");
			int a=input.nextInt();
			if(a%2!=0)
			suma=suma+a;
			else i--;
		}
		
		System.out.println("Suma primelor "+n+" numere impare = "+suma);
		
		
		
		
		
		
	}

}