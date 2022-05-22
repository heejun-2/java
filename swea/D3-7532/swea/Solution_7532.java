package swea;

import java.util.*;

public class Solution_7532 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int S = sc.nextInt();
			int E = sc.nextInt();
			int M = sc.nextInt();
			int year = S;

			
			while(true) {
				if((year-S) % 365 == 0 && (year-E) % 24 == 0 && (year-M) % 29 == 0) {
					break;
				}
				year += 365;
			}
			
			System.out.println("#"+tc+" "+year);
			
		}
		
	}

}
