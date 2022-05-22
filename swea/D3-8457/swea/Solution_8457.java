package swea;

import java.util.*;

public class Solution_8457 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int B = sc.nextInt();
			int E = sc.nextInt();
			int count = 0;
			
			for(int i = 0; i < N; i++) {
				int tmp = sc.nextInt();
				
				for(int j = B - E; j <= B + E; j++) {
					if(j % tmp == 0) {
						count++;
						break;
					}
				}
				
			}
			
			System.out.println("#"+tc+" "+count);
			
		}
	}

}
