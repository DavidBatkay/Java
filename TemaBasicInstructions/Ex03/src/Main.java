import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x= new Scanner(System.in);
		System.out.println("Introduceti primul numar:");
		int a=x.nextInt();
		System.out.println("Introduceti al doilea numar:");
		int b=x.nextInt();
		switch (a%2 +b%2)
		{
		case 0:System.out.println("Media aritmetica = "+(a+b)/2); break;
		case 1:System.out.println("Suma = "+(a+b)); break;
		case 2:System.out.println("Produsul = "+(a*b)); break;
		}
	}

}
