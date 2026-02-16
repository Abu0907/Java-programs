import java.util.Scanner;

public class powerofnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int a = sc.nextInt();
		System.out.print("Enter a power value : ");
		int b = sc.nextInt();
		int powervalue = 1;
		sc.close();
		for(int i=1;i<=b;i++) {
			powervalue = powervalue * a;
		}
		System.out.println("Answer : "+powervalue);
	}
}
