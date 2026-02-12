import java.util.Scanner;

public class LCMofTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a first number : ");
		int a = sc.nextInt();
		System.out.print("enter a second number : ");
		int b = sc.nextInt();
		int res = a < b?b:a;
		while(true) {
			if(res%a==0 && res%b==0) {
				break;
			}
			res++;
		}
		sc.close();
		System.out.println("LCM value is : "+res);
	}
}
