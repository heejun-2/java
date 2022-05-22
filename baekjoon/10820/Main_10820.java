import java.util.*;

public class Main_10820 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			
			int small = 0;
			int big = 0;
			int num = 0;
			int space = 0;
			for(int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if(97 <= ch && ch <= 122) {
					small++;
				}
				else if(65 <= ch && ch <= 90) {
					big++;				
				}
				else if(48 <= ch && ch <= 57) {
					num++;
				}
				else if(ch == 32) {
					space++;
				}
			}
			System.out.println(small+" "+big+" "+num+" "+space);
		}
	}

}
