package swea;

import java.util.*;

public class Solution_6692 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			double p = 0;
			int x = 0;
			double sum = 0;
			
			for(int i = 0; i < N; i++) {
				p = sc.nextDouble();
				x = sc.nextInt();
				sum += p * x;
			}
			

			System.out.println("#"+tc+" "+sum);
		
		}
	}

}
