import java.util.Scanner;

public class fibonacciseries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a count : ");
		int count = sc.nextInt();
		sc.close();
		int a = 1;
		int b = 1;
		System.out.print(a+","+b);
		for(int i=1;i<count-1;i++) {
			int c = a + b;
			System.out.print(","+c);
			a = b;
			b = c;
			
		}
	}
}
