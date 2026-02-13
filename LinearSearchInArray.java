import java.util.Scanner;

public class LinearSearchInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a size of array :");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter elements with space : ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("enter a target number : ");
		int target = sc.nextInt();
		int res = -1;
		sc.close();
		for(int i=0;i<size;i++) {
			if(target == arr[i]) {
				res = i;
			}
		}
		if(0 <= res) {
			System.out.println("given target is found at index : "+ res);
		}
		else {
			System.out.println("given target is not in the array , so please check it.");
			
		}
	}
}
