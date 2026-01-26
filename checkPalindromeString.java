
import java.util.Scanner;

public class checkPalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a word : ");
		String data = sc.nextLine();
		sc.close();
		int length = data.length();
		String reversedata = "";
		for(int i=length-1;0<=i;i--) {
			reversedata = reversedata + data.charAt(i);
		}
		if(data.equals(reversedata)) {
			System.out.println("given string is palindrome");
		}
		else {
			System.out.println("given string is not palindrome");
		}
		
	}
}
