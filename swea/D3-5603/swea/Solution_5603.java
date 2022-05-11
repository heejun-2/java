package swea;

import java.util.*;

public class Solution_5603 {

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
				sum += arr[i];
			}
			
			int average = sum / N;
			int count = 0;
			for(int i = 0; i < N; i++) {
				int a = average - arr[i];
				if(a >= 1 ) {
					count += a;
				}
			}
			
			System.out.println("#"+tc+" "+count);
			

		}
	}

}
