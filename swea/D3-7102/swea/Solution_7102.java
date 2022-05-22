package swea;

import java.util.*;

public class Solution_7102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[] arr = new int[N+M+1];
			
			for(int i = 1; i <= N; i++) {
				for(int j = 1; j <= M; j++) {
					int tmp = i+j;
					arr[tmp]++;
				}
			}
			
			int max = 0;
			
			for(int i = 0; i < N+M+1; i++) {
				max = Math.max(max, arr[i]);
			}
			
			System.out.print("#"+tc+" ");
			for(int i = 0; i < N+M+1; i++) {
				if(arr[i] == max) {
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}
	}

}
