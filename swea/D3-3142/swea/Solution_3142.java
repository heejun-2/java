package swea;

import java.util.*;

public class Solution_3142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			for(int i = 0; i <= M; i++) {
				int sum = 2 * i + (M - i);
				if(sum == N) {
					System.out.println("#"+tc+" "+(M-i)+" "+i);
				}
			}
		}
	}

}
