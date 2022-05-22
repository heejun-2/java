package swea;

import java.util.*;

public class Solution_1204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int number = sc.nextInt();
			int[] arr = new int[101];
			
			for(int i = 0; i < 1000; i++) {
				int score = sc.nextInt();
				arr[score]++;
			}
			
			int max = 0;
			int result = 0;
			
			for(int i = 0; i <= 100; i++) {
				if(max <= arr[i]) {
					max = arr[i];
					result = i;
				}
			}
			
			System.out.println("#"+tc+" "+result);
			
		}
	}

}
