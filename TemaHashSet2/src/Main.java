import java.util.Scanner;
import java.util.HashSet;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		str=str.toLowerCase();
		System.out.println(containsAllVowels(str));
		input.close();
	}
	public static boolean containsAllVowels(String str) {
		HashSet<Character> hSet = new HashSet<Character>();
		hSet.add('a');
		hSet.add('e');
		hSet.add('i');
		hSet.add('o');
		hSet.add('u');
		for(char ch : str.toCharArray()) {
			if(hSet.contains(ch)) {
				hSet.remove(ch);
			}
		}
		//System.out.println(hSet); //debugging - checking what vowels remain unfound
		return hSet.isEmpty();
	}
}

