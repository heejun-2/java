package swea;

import java.util.*;

public class Solution_11856 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			String s = sc.next();
			int [] arr = new int[4];
			for(int i = 0; i < 4; i++) {
				arr[i] = s.charAt(i) - 65;
			}
			
			Arrays.sort(arr);
			
			if(arr[1] == arr[2]) {
				System.out.println("#"+tc+" No");
			}
			else if(arr[0] == arr[1] && arr[2] == (arr[3])) {
				System.out.println("#"+tc+" Yes");
			}
			
			else {
				System.out.println("#"+tc+" No");
			}
			
		}
	}

}
