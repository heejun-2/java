package swea;

import java.util.*;

public class Solution_5431 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] arr = new int[N+1];
			
			for(int i = 0; i < K; i++) {
				int tmp = sc.nextInt();
				arr[tmp] = 1;
			}
			
			System.out.print("#"+tc+" ");
			for(int i = 1; i < N+1; i++) {
				if(arr[i] == 0) {
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}
		
	}

}
