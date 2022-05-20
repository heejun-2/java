package swea;

import java.util.*;

public class Solution_10505 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			double sum = 0;
			int count = 0;
			
			for(int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			
			double average = sum / N;
			
			for(int i = 0; i < N; i++) {
				if(arr[i] <= average) {
					count++;
				}
			}
			
			System.out.println("#"+tc+" "+count);
		}
	}

}
