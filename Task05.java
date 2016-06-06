/*
You have been given3 integers l, r and k. Find how many numbers between l and r (both inclusive) are divisible by k. You do not need to print these numbers, you just have to find their count.
*/

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
