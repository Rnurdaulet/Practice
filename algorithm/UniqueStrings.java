/*
 * https://www.hackerearth.com/problem/algorithm/the-lord-of-the-strings-1/
 * Given a word consisting of lowercase English letters, write a program to remove duplicates from the word.
 * The characters in the output must preserve the same order,as their first appearance in the original word.
*/
package sevennationarmy;

import java.util.ArrayList;
import java.util.Scanner;

public class UniqueStrings {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		String s;
		char ch;
		String ans = "";
		int l;

		ArrayList<String> listF = new ArrayList<String>();
		for (int i = 0; i < T; i++) {
			listF.add(s = in.nextLine());
			l = s.length();
			
			for (int j = 0; j < l; j++) {
				ch = s.charAt(j);
				if (ch != ' ')
					ans = ans + ch;
				s = s.replace(ch, ' ');
			}
		}

		System.out.println(ans);
	}
}
