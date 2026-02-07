import java.util.Scanner;

public class findlargestnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// find largest number between two number
//		System.out.print("enter first number : ");
//		int n1 = sc.nextInt();
//		System.out.print("enter second number : ");
//		int n2 = sc.nextInt();
//		
//		if(n1 < n2) {
//			System.out.println("largest number is :" + n2);
//		}
//		else {
//			System.out.println("largest number is :"+ n1);
//		}
		
		// find largest number among 3 number
		System.out.print("enter first number : ");
		int n1 = sc.nextInt();
		System.out.print("enter second number : ");
		int n2 = sc.nextInt();
		System.out.print("enter third number : ");
		int n3 = sc.nextInt();
		System.out.println(n1+","+n2+","+n3);
		sc.close();
		if(n1 < n2) {
			if(n2 < n3) {
				System.out.println("largest number is :" + n3);
			}
			else{
				System.out.println("largest number is :" + n2);
			}
		}
		else if(n1 < n3) {
			System.out.println("largest number is :" + n3);
		}
		else {
			System.out.println("largest number is :"+ n1);
		}
	}
	

}
