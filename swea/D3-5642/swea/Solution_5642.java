package swea;

import java.util.*;

public class Solution_5642 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			
			for(int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			
			int max = -9999;
			int sum = 0;
			
			for(int i = 0; i < N; i++) {
				sum += arr[i];
				if(sum > max) {
					max = sum;
				}
				if(sum < 0) {
					sum = 0;
				}
			}
			
			System.out.println("#"+tc+" "+max);
		}

	}

}
