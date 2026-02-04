import java.util.Scanner;

public class checkStrongnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number : ");
		int num = sc.nextInt();
		sc.close();
		int orginal = num;
		int result = 0;
		while(num != 0) {
			int digit = num % 10;
			int factnum = 1;
			for(int i=1;i<=digit;i++) {
				factnum *=i;
			}
			result = result + factnum; 
			num = num / 10;
		}
		if(orginal == result) {
			System.out.println("given number is strong number");
		}
		else {
			System.out.println("given number is not strong number");
		}
	}
}
