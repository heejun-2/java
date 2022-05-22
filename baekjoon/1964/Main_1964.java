import java.util.*;

public class Main_1964 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long sum = 0;
		
		for(int i = 1; i <= N; i++) {
			long dot = (i+1)*5 - 5;
			sum += dot;			
		}
		
		for(int j = 2; j <= N; j++) {
			long m = 2*j-1;
			sum -= m;
		}
		
		
		System.out.print(sum%45678);
	}

}
