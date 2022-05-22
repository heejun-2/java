package swea;

import java.util.*;

public class Solution_1284 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int P = sc.nextInt();
			int Q = sc.nextInt();
			int R = sc.nextInt();
			int S = sc.nextInt();
			int W = sc.nextInt();
			
			int A = P * W;
			int B = 0;
			
			if(W <= R) {
				B = Q;
			}
			else {
				B = Q + (W-R) * S;
			}
			
			System.out.println("#"+tc+" "+Math.min(A, B));
		}
	}

}
