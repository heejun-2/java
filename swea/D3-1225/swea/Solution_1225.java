package swea;

import java.util.*;

public class Solution_1225 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for(int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();
			Queue <Integer> q = new LinkedList<>();
			int minus = 1;
			
			for(int i = 0; i < 8; i++) {
				int tmp = sc.nextInt();
				q.add(tmp);
			}
			
			while(true) {
				int tmp = q.poll();
				tmp -= minus;
				minus++;
				if(minus==6) {
					minus = 1;
				}
				if(tmp<=0) {
					tmp = 0;
				}
				q.add(tmp);
				if(tmp==0) {
					break;
				}
			}
			
			System.out.print("#"+tc+" ");
			
			while(!q.isEmpty()) {
				int tmp = q.poll();
				System.out.print(tmp+" ");
			}
			
			System.out.println();
			
		}
		
	}

}
