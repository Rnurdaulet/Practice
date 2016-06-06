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
