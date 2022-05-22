package swea;

import java.util.*;

public class Solution_2029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("#"+tc+" "+(a/b)+" "+(a%b));
		}
	}

}
