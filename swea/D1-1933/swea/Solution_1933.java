package swea;

import java.util.*;

public class Solution_1933 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			if(10%i==0) {
				System.out.print(i+" ");
			}
		}
	}

}
