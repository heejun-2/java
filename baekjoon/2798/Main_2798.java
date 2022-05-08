import java.util.*;

public class Main_2798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = 0;
		
		for(int i = 0; i < N-2; i++) {
			for(int j = i+1; j < N-1; j++) {
				for(int k = j+1; k < N; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					
					if(sum <= M) {
						max = Math.max(max, sum);
					}
					if(sum == M) {
						break;
					}
				}
			}
		}
		System.out.println(max);
	}

}
