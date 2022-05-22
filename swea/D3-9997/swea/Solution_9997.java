package swea;

import java.util.*;

public class Solution_9997 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int p = sc.nextInt();
			int minute = 2 * p;
			int hour = 0;
			
			while(minute >= 60) {
				minute -= 60;
				hour += 1;
			}
			
			while(hour >= 12) {
				hour -= 12;
			}
			
			System.out.println("#"+tc+" "+hour+" "+minute);
		}
	}

}
