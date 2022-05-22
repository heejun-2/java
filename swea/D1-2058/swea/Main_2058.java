package swea;

import java.util.*;

public class Main_2058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sum = 0;
		
		while(N != 0) {
			sum += N % 10;
			N = N / 10;
		}
		System.out.println(sum);
	}

}
