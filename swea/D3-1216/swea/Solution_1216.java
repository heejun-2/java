package swea;

import java.util.*;

public class Solution_1216 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for(int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();
			int max = 0;
			char[][] arr = new char[100][100];
			
			for(int i = 0; i < 100; i++) {
				String s = sc.next();
				for(int j = 0; j < 100; j++) {
					arr[i][j] = s.charAt(j);
				}
			}
			
			
			for(int k = 2; k <= 100; k++) {
				for(int i = 0; i < 100; i++) {
					for(int j = 0; j < 100-k; j++) {
						int flag=0;
						for(int l = 0; l < k/2; l++) {
							if(arr[i][j+l] != arr[i][j+k-l-1]) {
								flag = 1;
								break;
							}
						}
						if(flag==0) {
							max = Math.max(max, k);
						}
					}
				}
			}
			
			
			for(int k = 2; k <= 100; k++) {
				for(int i = 0; i < 100; i++) {
					for(int j = 0; j < 100-k; j++) {
						int flag=0;
						for(int l = 0; l < k/2; l++) {
							if(arr[j+l][i] != arr[j+k-l-1][i]) {
								flag = 1;
								break;
							}
						}
						if(flag==0) {
							max = Math.max(max, k);
						}
					}
				}
			}
			
			
			
			System.out.println("#"+tc+" "+max);
		}
	}

}
