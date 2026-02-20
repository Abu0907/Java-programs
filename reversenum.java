import java.util.Scanner;

public class reversenum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number : ");
		int data = sc.nextInt();
		int reverse = 0;
		sc.close();
		while(data != 0) {
			int n = data % 10;
			reverse = reverse * 10 + n;
			data = data / 10;
		}
		System.out.println("Reverse order: "+reverse);
		
	}
}
