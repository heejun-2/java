import java.util.*;

public class Main_7567 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char[] arr = new char[50];
		
		while(sc.hasNext()) {
					
			int height = 10;
			
			String s = sc.next();
			
			for(int i = 0; i < s.length(); i++) {
				arr[i] = s.charAt(i);
			}
			
			for(int i = 0; i < s.length()-1; i++) {
				
				if(arr[i] == arr[i+1]) {
					height += 5;
				}
				
				else {
					height += 10;
				}
				
			}
			System.out.println(height);		
		}
		
	}

}
