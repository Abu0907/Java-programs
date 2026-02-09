import java.util.Arrays;
import java.util.Scanner;

public class FindSecondLargestElementInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a size of array :");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter elements with space : ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i =0;i<size;i++) {
			System.out.print(arr[i]+",");
		}
		
		Arrays.sort(arr);
		System.out.println("----------");
		System.out.println("second largest element is : "+arr[size-2]);
		
	}
}
