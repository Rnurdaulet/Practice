import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		int l, k, r;
		int count = 0;

		Scanner in = new Scanner(System.in);
		l = in.nextInt();
		r = in.nextInt();
		k = in.nextInt();
		for (int i = l; i <= r; i++) {
			if (i % k == 0) {
				count++;
			}

		}
		System.out.println(count);

	}

}
