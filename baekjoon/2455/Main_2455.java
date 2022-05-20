import java.util.*;

public class Main_2455 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int now = 0;
		int max = 0;
		
		for(int i = 0; i < 4; i++) {
			int out = sc.nextInt();
			int in = sc.nextInt();
			now -= out;
			now += in;
			max = Math.max(max, now);
		}			
		
		System.out.print(max);
	}

}
