package swea;

import java.util.*;

public class Solution_8658 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int max = 0;
			int min = 1000;
			
			for(int i = 0; i < 10; i++) {
				int tmp = sc.nextInt();
				int sum = 0;
				
				while(true) {
					sum += tmp % 10;
					tmp = tmp / 10;
					if(tmp == 0) {
						break;
					}
				}
				
				max = Math.max(max, sum);
				min = Math.min(min, sum);
				
			}
			
			System.out.println("#"+tc+" "+max+" "+min);
			
		}
		
	}

}
