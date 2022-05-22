package swea;

import java.util.*;

public class Solution_7510 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int count = 0;
			
			for(int i = 1; i <= N; i++) {
				int sum = 0;
				for(int j = i; j <= N; j++) {
					sum += j;
					if(sum == N) {
						count++;
						break;
					}
					if(sum > N) {
						break;
					}
				}
			}
			
			System.out.println("#"+tc+" "+count);
		}
	}

}
