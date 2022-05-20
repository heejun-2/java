package swea;

import java.util.*;

public class Solution_8741 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			String[] arr = new String[3];
			for(int i = 0; i < 3; i++) {
				String s = sc.next();
				arr[i] = s.substring(0,1).toUpperCase();
			}
			
			System.out.print("#"+tc+" ");
			for(int i = 0; i < 3; i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
			
		}
	}

}
