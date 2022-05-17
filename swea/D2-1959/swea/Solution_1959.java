package swea;

import java.util.*;

public class Solution_1959 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] A = new int[N];
			int[] B = new int[M];
				
			for(int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
			}
			
			for(int i = 0; i < M; i++) {
				B[i] = sc.nextInt();
			}
			
			
			int max = 0;
			
			if(N < M) {
				for(int j = 0; j < M - N + 1; j++) {
					int sum = 0;
					for(int i = 0; i < N; i++) {
						sum += A[i] * B[i+j];
					}
					if(max < sum) {
						max = sum;
					}
				}
			}
			
			else if(N > M) {
				for(int i = 0; i < N - M + 1; i++) {
					int sum = 0;
					for(int j = 0; j < M; j++) {
						sum += B[j] * A[j+i];
					}
					if(max < sum) {
						max = sum;
					}
				}
			}
			
			System.out.println("#"+tc+" "+max);
		}
	}

}
