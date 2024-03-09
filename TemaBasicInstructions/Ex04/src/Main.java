import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner x= new Scanner(System.in);
		System.out.println("Introduceti primul numar:");
		int a=x.nextInt();
		int min=a;
		System.out.println("Introduceti al doilea numar:");
		a=x.nextInt();
		if(a<min) min=a;
		System.out.println("Introduceti al treilea numar:");
		a=x.nextInt();
		if(a<min) min=a;
		System.out.println("Minimul dintre cele 3 numere este: "+min);
		
	}

}
