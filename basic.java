import java.util.Scanner;
public class basic{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("what is the target :");
        int target = scan.nextInt();
        System.out.println("give a number");
        int[] num = new int[3];
        for(int i=0;i<=2;i++){
            num[i] = scan.nextInt();
        }
    }
}