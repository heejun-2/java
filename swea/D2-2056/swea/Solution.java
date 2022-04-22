package swea;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
		int[] days= {31,28,31,30,31,30,31,31,30,31,30,31};       
		int T = sc.nextInt();
        
		for(int i = 1; i <= T; i++) {
			String s=sc.next();
			String year=s.substring(0,4);
			String month=s.substring(4,6);
			String day=s.substring(6,8);
            
			if(Integer.parseInt(month)>=1 && Integer.parseInt(month)<=12 && Integer.parseInt(day)>=0 
					&& Integer.parseInt(day)<=days[Integer.parseInt(month)-1]){
				System.out.println("#"+i+" "+year+"/"+month+"/"+day);
            }
			else {
				System.out.println("#"+i+" -1");
			}
			
			
		}
		

	}

}
