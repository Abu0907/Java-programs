import java.util.Scanner;

public class SumOfArrayElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int sum = 0;
		System.out.print("Enter elements with space : ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		sc.close();
		System.out.println("sum of array is : "+sum);
	}
}
