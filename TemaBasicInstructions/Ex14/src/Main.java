
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 1000; i++) {
            int a = i;
            int b = 1000 - i;
            if ((a % 17 == 0 || a % 13 == 0) && (b % 19 == 0 || b % 7 == 0 )) {
                System.out.println("Perechea ( " + a + " , " + b + " )");
            }
		}

	}
}
