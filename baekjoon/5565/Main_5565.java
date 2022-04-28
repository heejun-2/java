import java.util.*;

public class Main_5565 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int sum = 0;
		
		
		for(int i = 1; i <= 9; i++) {
			int book = sc.nextInt();
			sum +=book;
		}
		
			
		System.out.print(total-sum);
	}

}
