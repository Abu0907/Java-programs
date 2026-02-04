import java.util.Scanner;

public class CountEvenandOddInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a size of array :");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int even = 0, odd = 0;
		
		System.out.println("Enter elements with space : ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
			if(arr[i]%2 ==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		sc.close();
		System.out.println("Even count : "+even+" , Odd count : "+odd);
	}
}
