/*
You have been given a positive integer N. You need to find and print the Factorial of this number. The Factorial of a positive integer N refers to the product of all number in the range from 
1 to N. You can read more about the factorial of a number here.
Input Format:
The first and only line of the input contains a single integer N denoting the number whose factorial you need to find.

Output Format
Output a single line denoting the factorial of the number N.

Constraints
1≤N≤10

*/
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
