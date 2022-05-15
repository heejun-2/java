package swea;

import java.util.*;

public class Solution_1221 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		String[] num = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
		
		for(int tc = 1; tc <= T; tc++) {
			
			ArrayList <Integer> a = new ArrayList();
			String k = sc.next();
			int N = sc.nextInt();
			
			for(int i = 0; i < N; i++) {
				String s = sc.next();
				for(int j = 0; j < 10; j++) {
					if(num[j].equals(s)) {
						a.add(j);
					}
				}
			}
			
			Collections.sort(a);
			System.out.println("#"+tc);
			for(int i = 0; i < N; i++) {
				int tmp = a.get(i);
				System.out.print(num[tmp]+" ");
			}
			System.out.println();
		}
	}

}
