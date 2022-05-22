package swea;

import java.util.*;

public class Solution_6853 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			int N = sc.nextInt();
			
			int number1 = 0;
			int number2 = 0;
			int number3 = 0;
			
			for(int i = 0; i < N; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				
				if((x > x1 && x < x2) && (y > y1 && y < y2)) {
					number1++;
				}
				else if((x < x1 || x > x2) || (y < y1 || y > y2)) {
					number3++;
				}
				else {
					number2++;
				}
				
			}
			
			System.out.println("#"+tc+" "+number1+" "+number2+" "+number3);
		}
	}

}
