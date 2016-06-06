/*Read different types of data from standard input, process them as shown in output format and print the answer to standard output.
Input format:
First line contains integer N.
Second line contains string S.

Output format:
First line should contain N×2.
Second line should contain the same string 
S.

Constraints:

0≤N≤10
1≤|S|≤15 where 
|S|= length of string 
*/

import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		
		if( n<=10&&n>=0){
			System.out.println(n*2);
			
		}
		else {
			System.out.println("Error int");
		}
		if(s.length()>=1&& s.length()<=15)
		{
			System.out.println(s);
		}
		else {
			
			System.out.println("Error String");
		}
	}

}
