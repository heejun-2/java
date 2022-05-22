package swea;

import java.util.*;

public class Solution_8673 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		
		for(int tc = 1; tc <= T; tc++) {
			int K = sc.nextInt();
			Queue <Integer> q = new LinkedList<>();
			int sum = 0;
			
			
			for(int i = 0; i < Math.pow(2, K); i++) {
				int tmp = sc.nextInt();
				q.add(tmp);
			}
			
			for(int i = 0; i < Math.pow(2, K) - 1; i++) {
				int a = q.poll();
				int b = q.poll();
				sum += Math.abs(a-b);
				int tmp = Math.max(a, b);
				q.add(tmp);
			}
			
			System.out.println("#"+tc+" "+sum);
			
		}
	}

}
