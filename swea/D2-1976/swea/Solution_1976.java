package swea;

import java.util.*;

public class Solution_1976 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int D = sc.nextInt();
			
			int E = A+C;
			int F = B+D;
			
			if(F>=60) {
				F -= 60;
				E += 1;
			}
			
			while(E > 12) {
				E -= 12;
			}
			
			System.out.println("#"+tc+" "+E+" "+F);
			
		}
	}

}
