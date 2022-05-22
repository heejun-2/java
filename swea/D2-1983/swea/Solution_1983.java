package swea;

import java.util.*;

public class Solution_1983 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] score = {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			
			int N = sc.nextInt();
			int K = sc.nextInt();
			double P = 0;
			Double[] arr = new Double[N];
			
			for(int i = 0; i < N; i++) {
				int A = sc.nextInt();
				int B = sc.nextInt();
				int C = sc.nextInt();
				double sum = A * 0.35 + B * 0.45 + C * 0.2;
				arr[i] = sum;
				
				if(i+1 == K) {
					P = sum;
				}
				
			}
			
			Arrays.sort(arr);
			
			int number = 0;
			
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == P) {
					number = i;
				}
			}
			
			number = number / (N/10);
			
			System.out.println("#"+tc+" "+score[number]);
			
		}
		
	}

}
