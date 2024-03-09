import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Introduceti n: ");
		int n=input.nextInt();
		System.out.println();
		int max=-1;
		int naux=n;
		while(n>0)
		{
			if(max<(n%10)) max=n%10;
			n=n/10;
		}
		System.out.println("Cifra maxima a numarului "+naux+" este: "+max);
	}

}
