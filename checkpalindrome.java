
import java.util.Scanner;

public class checkpalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number : ");
		int real = sc.nextInt();
		int orginal = real;
		int reverse = 0;
		while(real != 0) {
			int n = real % 10;
			reverse = reverse * 10 + n;
			real = real / 10;
		}
		if(orginal == reverse) {
			System.out.println("given number is palindrome");
		}
		else {
			System.out.println("given number is not palindrome");
		}
	}
}
