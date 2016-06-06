/*
You have been given a String S consisting of uppercase and lowercase English alphabets. You need to change the case of each alphabet 
in this String. 
That is, all the uppercase letters should be converted to lowercase and all the lowercase letters should be converted to uppercase. 
You need to then print the resultant String to output.

Input Format
The first and only line of input contains the String S

Output Format
Print the resultant String on a single line.
Constraints
1≤|S|≤100 where 
|S| denotes the length of string S.
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_01_1 {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter sentence:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String S = "";
		if (str.length() >= 1 && str.length() <= 100) {
			for (int i = 0; i < str.length(); i++) {
				if (Character.isUpperCase(str.charAt(i)) == true) {
					char ch2 = Character.toLowerCase(str.charAt(i));
					S = S + ch2;
				} else if (Character.isLowerCase(str.charAt(i)) == true) {
					char ch2 = Character.toUpperCase(str.charAt(i));
					S = S + ch2;
				} else
					S = S + str.charAt(i);

			}
			System.out.println(S);
		}

		else {
			System.out.println("Error 1<=|S|<=100");
		}
	}
}
