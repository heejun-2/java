package swea;

import java.util.*;

public class Solution_1979 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[][] arr = new int[N][N];
			int result = 0;
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int count = 0;
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(arr[i][j] == 1) {
						count++;
					}
					else if(arr[i][j] == 0) {
						if(count == K) {
							result++;
						}
						count = 0;
					}
				}
				if(count == K) {
					result++;
				}
				count = 0;
			}
			
			for(int j = 0; j < N; j++) {
				for(int i = 0; i < N; i++) {
					if(arr[i][j] == 1) {
						count++;
					}
					else if(arr[i][j] == 0) {
						if(count == K) {
							result++;
						}
						count = 0;
					}
				}
				if(count == K) {
					result++;
				}
				count = 0;
			}
			
			System.out.println("#"+tc+" "+result);
			
		}
			
	}

}
