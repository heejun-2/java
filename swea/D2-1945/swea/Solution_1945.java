package swea;

import java.util.*;

public class Solution_1945 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();			
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			int e = 0;
			
			while(N != 1) {
				if(N % 2 == 0) {
					N /= 2;
					a++;
				}
				
				if(N % 3 == 0) {
					N /= 3;
					b++;
				}
				
				if(N % 5 == 0) {
					N /= 5;
					c++;
				}
				
				if(N % 7 == 0) {
					N /= 7;
					d++;
				}
				
				if(N % 11 == 0) {
					N /= 11;
					e++;
				}
			}
			
			System.out.println("#"+tc+" "+a+" "+b+" "+c+" "+d+" "+e);
		}
	}

}
