package swea;

import java.util.*;

public class Solution_13229 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		String[] arr = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
		
		for(int tc = 1; tc <= T; tc++) {
			String s = sc.next();
			
			if(s.equals(arr[6])) {
				System.out.println("#"+tc+" 7");
			}
			for(int i = 0; i < 6; i++) {				
				if(s.equals(arr[i])) {
					System.out.println("#"+tc+" "+(6-i));
				}
			}
			
		}
		
	}

}
