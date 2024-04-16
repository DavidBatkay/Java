import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashSet<String> hSet = new HashSet<String>();
		int n=input.nextInt();
		while(n<1 || n>100000) {
			System.err.println("Number must be part of [1,10000]");
			n=input.nextInt();
		}
		Scanner inputLine = new Scanner(System.in);
		for(int i=n;i>0;i++) {
			
			String line = new String(inputLine.nextLine());
			String[] stringArray=line.split(" ");
			hSet.add(stringArray[stringArray.length-1]);
			System.out.println(hSet.size());
		}
		input.close();
		inputLine.close();
	}

}
