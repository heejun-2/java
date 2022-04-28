import java.util.*;

public class Main_4153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			
			if(x == 0 && y == 0 && z ==0) {
				break;
			}
			
			if((x * x + y * y) == z * z) {
				System.out.println("right");
			}
			else if(x * x == (y * y + z * z)) {
				System.out.println("right");
			}
			else if(y * y == (x * x + z* z)) {
				System.out.println("right");
			}
			else {
				System.out.println("wrong");
			}
		}
		
	}

}
