package swea;

import java.util.*;

public class Solution_1970 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int A = 0;
			int B = 0;
			int C = 0;
			int D = 0;
			int E = 0;
			int F = 0;
			int G = 0;
			int H = 0;
			
			while(N >= 50000) {
				N -= 50000;
				A += 1;
			}
			
			while(N >= 10000) {
				N -= 10000;
				B += 1;
			}
			
			while(N >= 5000) {
				N -= 5000;
				C += 1;
			}
			
			while(N >= 1000) {
				N -= 1000;
				D += 1;
			}
			
			while(N >= 500) {
				N -= 500;
				E += 1;
			}
			
			while(N >= 100) {
				N -= 100;
				F += 1;
			}
			
			while(N >= 50) {
				N -= 50;
				G += 1;
			}
			
			while(N >= 10) {
				N -= 10;
				H += 1;
			}
			
			System.out.println("#"+tc);
			System.out.println(A+" "+B+" "+C+" "+D+" "+E+" "+F+" "+G+" "+H);
		}
	}

}
