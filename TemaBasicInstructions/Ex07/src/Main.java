import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Cate numere veti introduce?");
		int n= input.nextInt();
		int suma=0;
		for(int i=0;i<n;i++)
		{
			System.out.println("Introduceti numere ("+i+"/"+n+"):");
			int a=input.nextInt();
			suma=suma+a;
		}
		double ma=(double) suma/n;
		
		System.out.println("Media aritmetica a numerelor = "+ma);
		
		
		
		
		
		
	}

}	