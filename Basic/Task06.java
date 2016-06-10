import java.math.BigInteger;
import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int user_value = scanner.nextInt();
		long[] user_sized_array = new long[user_value];
		BigInteger answer = new BigInteger("1");
		for (int i = 0; i <= (user_value - 1); i++) {
			user_sized_array[i] = scanner.nextInt();
		}
		long modulo_value = 1000000007;
		BigInteger biginteger = new BigInteger("1000000007");
		BigInteger value_answer;
		for (int j = 0; j <= (user_value - 1); j++) {
			BigInteger big = new BigInteger("" + (user_sized_array[j]));
			answer = answer.multiply(big);
		}
		value_answer = answer.mod(biginteger);
		System.out.println(value_answer);
	}
}