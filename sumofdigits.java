import java.util.Scanner;

public class sumofdigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number : ");
		int num = sc.nextInt();
		int sum = 0;
		while(num != 0) {
			int store = num % 10;
			sum += store;
			num = num / 10;
		}
		sc.close();
		System.out.println("sum of digit : "+sum);
	}
}
