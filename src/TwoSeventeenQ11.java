import java.util.Scanner;

public class TwoSeventeenQ11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int list= sc.nextInt();
		int[] arr=new int[list];
		for(int i=0;i<arr.length;i++){
			arr[i]= sc.nextInt();
		}
		for (int i:arr) {
			if(i%2==0&&i%3==0){
				System.out.println(i);
			}
		}
	}
}
