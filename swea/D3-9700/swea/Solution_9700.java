package swea;

import java.util.*;

public class Solution_9700 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			double p = sc.nextDouble();
			double q = sc.nextDouble();
			
			double s1 = (1-p)*q;
			double s2 = p*(1-q)*q;
			
			if(s1 < s2) {
				System.out.println("#"+tc+" YES");
			}
			else {
				System.out.println("#"+tc+" NO");
			}
		}
	}

}
