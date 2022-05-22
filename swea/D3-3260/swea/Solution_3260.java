package swea;

import java.util.*;
import java.math.*;

public class Solution_3260 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			
			BigInteger A = sc.nextBigInteger();
			BigInteger B = sc.nextBigInteger();
			
			System.out.println("#"+tc+" "+A.add(B));
		}
		
	}

}
