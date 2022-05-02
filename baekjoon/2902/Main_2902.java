import java.util.*;

public class Main_2902 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 
	        String s = sc.next(); 
	 
	        for (int i = 0; i < s.length(); i++) { 
	            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') { 
	             
	                System.out.print(s.charAt(i)); 
	               
	            }
	        }
	}

}
