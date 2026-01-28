import java.util.Scanner;

public class checkposneg{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number : ");
		int num = sc.nextInt();
		if(num < 0) {
			System.out.print("given number is negative");
		}
		else if(0 < num) {
			System.out.print("given number is positive.");
		}
		else {
			System.out.println("given number is zero.");
		}
	}
}



// previous code
//package practice2;
//import java.util.Scanner;
//
//public class checkposneg {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter a number : ");
//		int num = sc.nextInt();
//		if(num < 0) {
//			System.out.println("the number is negative");
//		}
//		else if(1 <= num) {
//			System.out.println("the number is positive");
//		}
//		else {
//			System.out.println("the number is zero");
//		}
//	}
//}
