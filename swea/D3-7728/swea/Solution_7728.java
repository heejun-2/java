package swea;

import java.util.*;

public class Solution_7728 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			String s = sc.next();
			
			int[] arr = new int[10];
			
			for(int i = 0; i < s.length(); i++) {
				int tmp = s.charAt(i) - '0';
				arr[tmp]++;
			}
			
			int count = 0;
			
			for(int i = 0; i < 10; i++) {
				if(arr[i] >= 1) {
					count++;
				}
			}
			
			System.out.println("#"+tc+" "+count);
			
		}
	}

}
