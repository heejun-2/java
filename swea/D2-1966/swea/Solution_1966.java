package swea;

import java.util.*;

public class Solution_1966 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			
			for(int i = 0; i <N; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			
			System.out.print("#"+tc);
			for(int i = 0; i < N; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
	}

}
