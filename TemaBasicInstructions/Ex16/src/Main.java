import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Introduceti numarul : ");
		int n=input.nextInt();
		System.out.println();
		while(n>0)
		{
			int length = String.valueOf(n).length();
			System.out.print((int)(n/(Math.pow(10, length-1)))+" ");
			n=(int)(n%(Math.pow(10, length-1)));
		}
	}

}
