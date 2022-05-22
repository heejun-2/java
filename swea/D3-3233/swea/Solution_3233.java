package swea;

import java.util.*;

public class Solution_3233 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = A / B;
			int sum = 0;
			
			for(int i = 1; i <= C; i++) {
				sum += (1 + 2 * (i-1));			
			}
			
			System.out.println("#"+tc+" "+sum);
			}
					
		}
	}
