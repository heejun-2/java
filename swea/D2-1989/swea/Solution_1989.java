package swea;

import java.util.*;

public class Solution_1989 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			String s = sc.next();
			StringBuilder z = new StringBuilder(s);
			z = z.reverse();
			
			if(s.equals(z.toString())){
				System.out.println("#"+tc+" 1");
			}
			else {
				System.out.println("#"+tc+" 0");
			}
		}
	}

}
