package swea;

import java.util.*;

public class Solution_7087 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[] arr = new int[26];
			int count = 0;
			
			for(int i = 0 ; i < N; i++) {
				String s = sc.next();
				int tmp = s.charAt(0) - 65;
				arr[tmp] = 1;
			}
			
			for(int i = 0; i < 26; i++) {
				if(arr[i] == 1) {
					count++;
				}
				else if(arr[i] == 0) {
					break;
				}
			}
			
			System.out.println("#"+tc+" "+count);
			
			
		}
	}

}
