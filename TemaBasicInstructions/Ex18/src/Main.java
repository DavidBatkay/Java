import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Introduceti n: ");
		int n=input.nextInt();
		System.out.println();
		int min=10;
		int naux=n;
		while(n>0)
		{
			if(min>(n%10)) min=n%10;
			n=n/10;
		}
		System.out.println("Cifra minima a numarului "+naux+" este: "+min);
	}

}
