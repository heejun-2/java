package swea;

import java.util.*;

public class Solution_8104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] arr = new int[K];
			int count = 1;
			
			for(int i = 1; i <= N; i++) {
				if(i % 2 == 1) {
					for(int j = 0; j < K; j++) {
						arr[j] += count;
						count++;
					}
				}
				else {
					for(int j = K-1; j >= 0; j--) {
						arr[j] += count;
						count++;
					}
				}
			}
			
			System.out.print("#"+tc+" ");
			for(int i = 0; i < K; i++) {
				System.out.print(arr[i]+" ");
			}System.out.println();
		}
	}

}
