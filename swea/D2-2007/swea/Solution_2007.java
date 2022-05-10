package swea;

import java.util.*;

public class Solution_2007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			String s = sc.next();
			
			for(int i = 1; i <= s.length(); i++) {
				String a = s.substring(0,i);
				String b = s.substring(i,2*i);
				
				if(a.equals(b)) {
					System.out.println("#"+tc+" "+a.length());
					break;
				}
				
			}
			
		}
		
	}

}
