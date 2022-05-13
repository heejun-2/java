package swea;

import java.util.*;

public class Solution_13547 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			String s = sc.next();
			int point = 15 - s.length();
			int win = 0;
			
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == 'o') {
					win++;
				}
			}
			
			if(point + win >= 8) {
				System.out.println("#"+tc+" YES");
			}
			else {
				System.out.println("#"+tc+" NO");
			}
		}
	}

}
