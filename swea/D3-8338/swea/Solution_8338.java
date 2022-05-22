package swea;

import java.util.*;

public class Solution_8338 {

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
			
			int sum = arr[0];
			
			for(int i = 1; i < N; i++) {
				if(sum + arr[i] > sum * arr[i]) {
					sum += arr[i];
				}
				else {
					sum = sum * arr[i];
				}
			}
			
			
			System.out.println("#"+tc+" "+sum);
			
		}
	}

}
