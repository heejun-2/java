package swea;

import java.util.*;

public class Solution_10200 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			int max = 0;
			int min = 0;
			
			if(N <= A+B) {
				min = A+B-N;
				max = Math.min(A, B);
			}
			else if(N > A+B) {
				max = Math.min(A, B);
				min = 0;
			}
			
			System.out.println("#"+tc+" "+max+" "+min);
			
		}
	}

}
