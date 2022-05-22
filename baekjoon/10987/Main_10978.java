import java.util.*;

public class Main_10978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int sum = 0;		
		String s = sc.nextLine();
		
		for (int i= 0;i<s.length();i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'i' || s.charAt(i) == 'u') 
				sum ++;
		}
		System.out.print(sum);
	}

}
