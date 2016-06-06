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
			System.out.println("n не должно быть больше 0 или меньше  10");
		}
		if(s.length()>=1&& s.length()<=15)
		{
			System.out.println(s);
		}
		else {
			
			System.out.println("Ошибка");
		}
	}

}
