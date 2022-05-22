package swea;

import java.util.*;

public class Solution_8500 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			int sum = 0;
			
			for(int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			for(int i = 0 ; i < N; i++) {
				sum += arr[i];
			}
			
			sum += arr[N-1] + N;
			
			System.out.println("#"+tc+" "+sum);
		}
	}

}
