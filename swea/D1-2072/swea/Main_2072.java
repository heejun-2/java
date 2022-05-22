package swea;

import java.util.*;

public class Main_2072 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int sum = 0;
			for(int i = 1; i <= 10; i++) {
				int k = sc.nextInt();
				if(k % 2 == 1) {
					sum+= k;
				}
			}
			System.out.println("#"+tc+" "+sum);
		}
		
	}

}
