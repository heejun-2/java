package swea;

import java.util.*;

public class Solution_1215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for(int tc = 1; tc <= 10; tc++) {
			
			int N = sc.nextInt();
			int count = 0;
			char[][] arr = new char[8][8];
			
			for(int i = 0; i < 8; i++) {
				String s = sc.next();
				for(int j = 0; j < 8; j++) {
					arr[i][j] = s.charAt(j);
				}
			}
			
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8-N+1; j++) {
					
					char[] arr1 = new char[N];
					
					for(int k = 0; k < N; k++) {
						arr1[k] = arr[i][j+k];
					}
					
					int flag = 0;
					for(int k = 0; k < N/2; k++) {
						if(arr1[k] != arr1[N-k-1]) {
							flag = 1;
							break;
						}
					}
					if(flag == 0) {
						count++;
					}
					
				}
			}
			
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8-N+1; j++) {
					
					char[] arr1 = new char[N];
					
					for(int k = 0; k < N; k++) {
						arr1[k] = arr[j+k][i];
					}
					
					int flag = 0;
					for(int k = 0; k < N/2; k++) {
						if(arr1[k] != arr1[N-k-1]) {
							flag = 1;
							break;
						}
					}
					if(flag == 0) {
						count++;
					}
					
				}
			}
			
			System.out.println("#"+tc+" "+count);
			
		}
		
	}

}
