package swea;

import java.util.*;

public class Solution_2025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <=N; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
