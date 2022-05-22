package swea;

import java.util.*;

public class Solution_6485 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[] a = new int[N];
			int[] b = new int[N];
			
			for(int i = 0; i < N; i++) {
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}
			
			int P = sc.nextInt();
			int[] c = new int[P];
			int[] arr = new int[P];
			
			for(int i = 0; i < P; i++) {
				c[i] = sc.nextInt();
			}
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < P; j++) {
					if(c[j] >= a[i] && c[j] <= b[i]) {
						arr[j]++;
					}
				}
			}
			
			System.out.print("#"+tc+" ");
			for(int i = 0; i < P; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			
		}
	}

}
