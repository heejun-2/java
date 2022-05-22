package swea;

import java.util.*;

public class Solution_11387 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int D = sc.nextInt();
			int L = sc.nextInt();
			int N = sc.nextInt();
			
			int sum = 0;
			
			for(int i = 1; i <= N; i++) {
				sum += D * (1 + (i-1) * L * 0.01);
			}
			
			System.out.println("#"+tc+" "+sum);
		}
	}

}
