package swea;

import java.util.*;

public class Solution_8821 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int[] arr = new int[10];
			String s = sc.next();
			for(int i = 0; i < s.length(); i++) {
				int tmp = s.charAt(i) - '0';
				if(arr[tmp] == 0) {
					arr[tmp] = 1;
				}
				else {
					arr[tmp] = 0;
				}
			}
			
			int count = 0;
			for(int i = 0; i < 10; i++) {
				if(arr[i] == 1) {
					count++;
				}
			}
			
			System.out.println("#"+tc+" "+count);
		}
	}

}
