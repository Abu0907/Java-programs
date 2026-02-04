import java.util.Scanner;

public class CountVowelInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word : ");
		String data = sc.nextLine();
		sc.close();
		String duplicatedata = data.toLowerCase();
		int vowel = 0,consonant = 0;
		for(int i =0;i < duplicatedata.length();i++) {
			char ch = duplicatedata.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u') {
				vowel++;
			}
			else if('a' <= ch && ch <= 'z') {
				consonant++;
			}
		}
		System.out.println("vowels count : "+vowel+", consonant count : "+consonant);		
	}
}
