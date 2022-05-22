package swea;

import java.util.*;

public class Solution_6913 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] arr = new int[N];
			
			for(int i = 0 ; i < N; i++) {
				for(int j = 0; j < M; j++) {
					int tmp = sc.nextInt();
					arr[i] += tmp;
				}
			}
			
			int count = 0;
			int max = 0;
			
			for(int i = 0; i < N; i++) {
				max = Math.max(max, arr[i]);
			}
			
			for(int i = 0; i < N; i++) {
				if(arr[i] == max) {
					count++;
				}
			}
			
			System.out.println("#"+tc+" "+count+" "+max);
			
		}
	}

}
