package swea;

import java.util.*;

public class Solution_1860 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int K = sc.nextInt();
			
			int[] arr = new int[N];
			
			int flag = 0;
			
			for(int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			for(int i = 0; i < N; i++) {
				int sum = K * (arr[i] / M);
				if(sum < (i + 1)){
					flag = 1;
				}
			}
			
			if(flag == 0) {
				System.out.println("#"+tc+" Possible");
			}
			else {
				System.out.println("#"+tc+" Impossible");
			}
			
		}
	}

}
