package swea;

import java.util.*;

public class Solution_1229 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for(int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();
			LinkedList <Integer> l = new LinkedList<>();
			
			for(int i = 0; i < N; i++) {
				int tmp = sc.nextInt();
				l.add(tmp);
			}
			
			int x = sc.nextInt();
			for(int i = 0; i < x; i++) {
				String s = sc.next();
				
				if(s.equals("I")) {
					int idx = sc.nextInt();
					int z = sc.nextInt();
					int[] arr = new int[z];
					
					for(int j = 0; j < z; j++) {
						arr[j] = sc.nextInt();
					}
					
					for(int j = z-1; j >= 0; j--) {
						l.add(idx, arr[j]);
					}
				}
				
				else if(s.equals("D")) {
					int idx = sc.nextInt();
					int z = sc.nextInt();
					
					for(int j = 0; j < z; j++) {
						l.remove(idx);
					}
				}
			
			}
			
			System.out.print("#"+tc+" ");
			for(int i = 0; i < 10; i++) {
				System.out.print(l.get(i)+" ");
			}
			System.out.println();
			
		}
		
	}

}
