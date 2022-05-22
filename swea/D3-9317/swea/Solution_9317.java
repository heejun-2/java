package swea;

import java.util.*;

public class Solution_9317 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int count = 0;
			char[] arr1 = new char[N];
			char[] arr2 = new char[N];
			
			String s1 = sc.next();
			
			for(int i = 0; i < N; i++) {
				arr1[i] = s1.charAt(i);
			}
			
			String s2 = sc.next();
			
			for(int i = 0; i < N; i++) {
				arr2[i] = s2.charAt(i);
			}
			
			for(int i = 0; i < N; i++) {
				if(arr1[i] == arr2[i]) {
					count++;
				}
			}
			
			System.out.println("#"+tc+" "+count);
			
		}
	}

}
