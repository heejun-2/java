package swea;

import java.util.*;

public class Main_2056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for(int tc = 1; tc <= T; tc++) {
			String s = sc.next();
			String year = s.substring(0,4);
			String month = s.substring(4,6);
			String day = s.substring(6,8);
			
			if(Integer.parseInt(month) >= 1 && Integer.parseInt(month) <= 12 && 
					Integer.parseInt(day) > 0 && Integer.parseInt(day) <= days[Integer.parseInt(month)-1] ) {
				System.out.println("#"+tc+" "+year+"/"+month+"/"+day);
			}
			else {
				System.out.println("#"+tc+" -1");
			}
		
		}
	}

}
