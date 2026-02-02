import java.util.Scanner;

public class countdigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number : ");
	    long n = sc.nextLong();
		int c = 0;
		while(n != 0) {
			c++;
			n=n/10;
		}
		System.out.print("total digit : "+c);
	}
}
