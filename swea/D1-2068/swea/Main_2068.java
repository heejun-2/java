package swea;

import java.util.*;

public class Main_2068 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int[] arr = new int[10];
			for(int i = 0; i < 10; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.println("#"+tc+" "+arr[9]);
		}
	}

}
