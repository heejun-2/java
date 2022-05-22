package swea;

import java.util.*;

public class Solution_1926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			String s = Integer.toString(i);
			String temp = "";
			for(int j = 0; j < s.length(); j++) {
				if(s.charAt(j) == '3' || s.charAt(j) == '6' || s.charAt(j) == '9') {
					temp += "-";
				}
			}
			
			if(temp != "") {
				System.out.print(temp);
			}
			else {
				System.out.print(i);
			}
			System.out.print(" ");
		}
		
	}

}
