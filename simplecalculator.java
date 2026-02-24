import java.util.Scanner;

public class simplecalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter first number : ");
		int a = sc.nextInt();
		System.out.print("enter second number : ");
		int b = sc.nextInt();
		System.out.print("enter a operation : ");
		String o = sc.next();
		
		switch (o) {
		case "+":
			int c = a+b;
			System.out.println("value :" +c);
			break;
		case "-":
			int d = a-b;
			System.out.println("value :" +d);
			break;
		case "*":
			int e = a*b;
			System.out.println("value :" +e);
			break;
		case "/":
			int f = a/b;
			System.out.println("value :" +f);
			break;
		}
		sc.close();
	}
}
