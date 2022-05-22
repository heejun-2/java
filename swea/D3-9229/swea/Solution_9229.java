package swea;

import java.util.*;

public class Solution_9229 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] arr = new int[N];
			int max = 0;
			int sum = 0;
			
			for(int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int i = 0; i < N; i++) {
				for(int j = i+1; j < N; j++) {
					sum = arr[i]+arr[j];
					if(sum <= M && max < sum) {
						max = sum;
					}
				}
			}
			
			if(max == 0) {
				System.out.println("#"+tc+" -1");
			}
			else {
				System.out.println("#"+tc+" "+max);
			}
		}
	}

}
