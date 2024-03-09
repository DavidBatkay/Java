import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =  new Scanner(System.in);
		System.out.print("Introduceti n: ");
		int n=input.nextInt();
		System.out.println();
		int in=0;
		int naux=n;
		while(n>0)
		{
			in=in*10+n%10;
			n=n/10;
		}
		if(naux==in)System.out.println("Numarului este palindrom");
		else System.out.println("Numarul nu este palindrom");
	}

}
