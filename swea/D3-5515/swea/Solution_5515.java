package swea;

import java.util.*;

public class Solution_5515 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] day = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] a = {4, 5, 6, 0, 1, 2, 3};
		for(int tc = 1; tc <= T; tc++) {
			int m = sc.nextInt();
			int d = sc.nextInt();
			int sum = 0;
			
			for(int i = 1; i < m; i++) {
				sum += day[i];
			}
			
			sum += d-1;
			
			System.out.println("#"+tc+" "+a[sum % 7]);
			
		}
	}

}
