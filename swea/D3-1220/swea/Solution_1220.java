package swea;

import java.util.*;

public class Solution_1220 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for(int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();
			int count = 0;
			int[][] arr = new int[N][N];
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();					
				}
			}
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(arr[i][j]==1) {
						if(i+1 == N) {
							break;
						}
						if(arr[i+1][j]==2) {
							count++;
						}
						else {
							arr[i+1][j] = 1;
						}
					}
				}
			}
			
			System.out.println("#"+tc+" "+count);
		}
		
	}

}
