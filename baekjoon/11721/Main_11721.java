import java.util.*;

public class Main_11721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		for(int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
			if(i % 10 == 9) {
				System.out.println();
			}
		}
	}

}
