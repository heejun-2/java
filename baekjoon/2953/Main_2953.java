import java.util.*;

public class Main_2953 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int win = 0;
		
		for(int i = 1; i <= 5; i++) {
			int sum = 0;
			for(int j = 1; j <= 4; j++) {
				int score = sc.nextInt();
				sum += score;
				if(max <= sum) {
					max = sum;
					win = i;
				}
			}
		}
		System.out.print(win+" "+max);
	}

}
