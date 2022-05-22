package swea;

import java.util.*;

public class Solution_1984 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int[] arr = new int[10];
			int sum = 0;
			
			for(int i = 0; i < 10; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			
			Arrays.sort(arr);
			
			sum -= arr[0]+arr[9];
			
			System.out.println("#"+tc+" "+sum/8);
		}
	}

}
