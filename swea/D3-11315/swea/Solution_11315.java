package swea;

import java.util.*;

public class Solution_11315 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			char[][] arr = new char[N][N];
			
			for(int i = 0; i < N; i++) {
				String s = sc.next();
				for(int j = 0; j < N; j++) {
					arr[i][j] = s.charAt(j);
				}
			}
			
			
			int flag = 0;
			int result = 0;
			
			//가로
			for(int i = 0; i < N; i++) {
				flag = 0;
				for(int j = 0; j < N; j++) {
					if(arr[i][j] == '.') {
						flag = 1;
						break;
					}
				}
				if(flag == 0) {
					result = 1;
				}
			}
			
			
			//세로
			for(int i = 0; i < N; i++) {
				flag = 0;
				for(int j = 0; j < N; j++) {
					if(arr[j][i] == '.') {
						flag = 1;
						break;
					}
				}
				if(flag == 0) {
					result = 1;
				}
			}
			
			//대각선1
			for(int i = 0; i < N; i++) {
				flag = 0;
					if(arr[i][i] == '.') {
						flag = 1;
						break;
					}
				
				if(flag == 0) {
					result = 1;
				}
			}
			
			//대각선2
			for(int i = 0; i < N; i++) {
				flag = 0;
					if(arr[i][N-i-1] == '.') {
						flag = 1;
						break;
					}
				
				if(flag == 0) {
					result = 1;
				}
			}
			
			if(result == 1) {
				System.out.println("#"+tc+" YES");
			}
			else {
				System.out.println("#"+tc+" NO");
			}
			
		}
	}

}
