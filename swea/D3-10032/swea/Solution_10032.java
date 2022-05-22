package swea;

import java.util.*;

public class Solution_10032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			if(N % K == 0) {
				System.out.println("#"+tc+" 0");
			}
			else {
				System.out.println("#"+tc+" 1");
			}
			
		}
	}

}
