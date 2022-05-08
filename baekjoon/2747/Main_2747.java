import java.util.*;

public class Main_2747 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N+1];
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i = 2; i < N+1; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
		
		System.out.print(arr[N]);
	}

}
