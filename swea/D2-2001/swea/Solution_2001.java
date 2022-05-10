package swea;

import java.util.*;

public class Solution_2001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[][] arr = new int[N][N];
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++){
					arr[i][j] = sc.nextInt();
				}
			}
			
			int max = 0;
			
			for(int i = 0; i < N - M + 1; i++) {
				for(int j = 0; j < N - M + 1; j++) {
					int sum = 0;
					
					for(int k = 0; k < M; k++) {
						for(int p = 0; p < M; p++) {
							sum += arr[i+k][j+p];
						}
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
