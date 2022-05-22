package swea;

import java.util.*;

public class Solution_5356 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			String[] s = new String[5];
			
			for(int i = 0; i < 5; i++) {
				s[i] = sc.next();
			}
			
			int max = 0;
			
			for(int i = 0; i < 5; i++) {
				max = Math.max(max, s[i].length());
			}
			
			System.out.print("#"+tc+" ");
			for(int i = 0; i < max; i++) {
				for(int j = 0; j < 5; j++) {
					if(s[j].length() <= i) {
						continue;
					}
					System.out.print(s[j].charAt(i));
				}
			}
			System.out.println();
			
			
			
		}
	}

}
