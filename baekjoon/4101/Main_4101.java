import java.util.*;

public class Main_4101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(x == 0 && y == 0) {
				break;
			}
			
			if(x > y) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}

}
