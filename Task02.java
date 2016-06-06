/*
You have been given a String S. You need to find and print whether this string is a palindrome or not. If yes, print "YES" (without quotes), else print "NO" (without quotes).
Input Format
The first and only line of input contains the String S. The String shall consist of lowercase English alphabets only.
Output Format
Print the required answer on a single line.
Constraints 
1≤|S|≤100
Note
String S consists of lowercase English Alphabets only
*/
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
