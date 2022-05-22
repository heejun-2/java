package swea;

import java.util.*;

public class Solution_8931 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int K = sc.nextInt();
			Stack <Integer> s = new Stack<>();
			int sum = 0;
			
			for(int i = 0; i < K; i++) {
				int tmp = sc.nextInt();
				
				if(tmp == 0) {
					s.pop();
				}
				else {
					s.push(tmp);
				}
				
			}
			
			while(!s.isEmpty()) {
				sum += s.pop();
			}
			
			System.out.println("#"+tc+" "+sum);
			
		}
	}

}
