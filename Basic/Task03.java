import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, fact = 1;

		Scanner in = new Scanner(System.in);
		n = in.nextInt();

		if (n < 0)
			System.out.println("negative factorial");
		else {
			for (int c = 1; c <= n; c++)
				fact = fact * c;
			System.out.println(fact);
		}
	}

}
