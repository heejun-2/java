package swea;

import java.util.*;

public class Solution_5601 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			
			System.out.print("#"+tc+" ");
			
			for(int i = 1; i <= N; i++) {
				System.out.print("1/"+N+" ");
			}
			
			System.out.println();
		}
		
	}

}
