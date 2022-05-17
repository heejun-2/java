package swea;

import java.util.*;

public class Solution_1928 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			String encode = sc.next();
			String decode = new String(Base64.getDecoder().decode(encode));
			
			System.out.println("#"+tc+" "+decode);
		}
	}

}
