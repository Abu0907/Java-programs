import java.util.Scanner;

public class GCDofTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter first number : ");
		int a = sc.nextInt();
		System.out.print("enter second number : ");
		int b = sc.nextInt();
		sc.close();
		int m=0;
		if(a < b) {
			for(int i=1;i<=b;i++) {
				if(a%i==0 && b%i==0) {
					m =i;
				}
			}
		}
		else {
			for(int i=1;i<=a;i++) {
				if(a%i==0 && b%i==0) {
					m =i;
				}
			}
		}
		System.out.println("GCD number is : "+m);
	}
}
