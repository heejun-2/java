package swea;

import java.util.*;

public class Solution_10804 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			String s = sc.next();
			String a = new StringBuilder(s).reverse().toString();
			
			char[] arr = new char[a.length()];
			
			for(int i = 0; i < a.length(); i++) {
				arr[i] = a.charAt(i);
				
				if(arr[i] == 'b') {
					arr[i] = 'd';
				}
				else if(arr[i] == 'd') {
					arr[i] = 'b';
				}
				else if(arr[i] == 'p') {
					arr[i] = 'q';
				}
				else if(arr[i] == 'q') {
					arr[i] = 'p';
				}
			}
			
			System.out.print("#"+tc+" ");
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
		
		}
	}

}
