import java.util.Scanner;

public class checkArmstrongnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		int orginal = num;
		int num1 = num;
		int digit = 0;
		//calculate number digit
		while(num != 0) {
			digit++;
			num /= 10;
		}
		
		int armstrongnum = 0;
		//calculate armstrong number
		while (num1 != 0) {
			int value = num1 % 10;
			armstrongnum = (int)(armstrongnum + Math.pow(value,digit));
			num1 /= 10;
		}
		
		//check number armstrong or not
		if(orginal == armstrongnum) {
			System.out.println("given number is armstrong number.");
		}
		else {
			System.out.println("given number is not armstrong number.");
		}
	}
}
