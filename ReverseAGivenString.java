import java.util.Scanner;

public class ReverseAGivenString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string value : ");
		String data = sc.nextLine();
		sc.close();
		int length = data.length();
		for(int i=length-1;0<=i;i--) {
			System.out.print(data.charAt(i));
		}
	}
}
