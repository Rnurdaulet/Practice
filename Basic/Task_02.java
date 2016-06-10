import java.util.Scanner;

public class Task_02 {

	public static void main(String[] args) {
		String s;
		String reverse;

		Scanner scan = new Scanner(System.in);
		s = scan.nextLine().toLowerCase();

		reverse = new StringBuilder(s).reverse().toString();
		if (s.length() >= 1 && s.length() <= 100) {
			if (s.equals(reverse)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		} else {
			System.out.println("Error:1<=|S|<=100");
		}

	}

}
