import java.util.*;

public class Main_2576 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[7];
		int sum = 0;
		int min = 100;
		
		for(int i = 0; i < 7; i++) {
			arr[i] = sc.nextInt();
				if(arr[i] % 2 == 1) {
					sum += arr[i];
					min = Math.min(min, arr[i]);
				}
		}
		
		if(sum == 0) {
			System.out.print("-1");
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
			
		
	}

}
