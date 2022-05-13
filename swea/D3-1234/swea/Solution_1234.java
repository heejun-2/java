package swea;

import java.util.*;

public class Solution_1234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for(int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();
			LinkedList <Integer> l = new LinkedList<>();
			
			String s = sc.next();
			for(int i = 0; i < N; i++) {
				int tmp = s.charAt(i) - '0';
				l.add(tmp);
			}
			
			int i = 1;
			while(true) {
				if(l.get(i) == l.get(i-1)) {
					l.remove(i);
					l.remove(i-1);
					i = 1;
				}
				else {
					i++;
				}
				if(i == l.size()) {
					break;
				}
			}
			
			System.out.print("#"+tc+" ");
			for(int j = 0; j < l.size(); j++) {
				System.out.print(l.get(j));
			}
			System.out.println();
			
		}
	}

}
