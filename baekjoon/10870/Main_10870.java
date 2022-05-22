import java.util.*;

public class Main_10870 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(fibonacci(n));
	}
	
		static int fibonacci(int n) {
			if(n<=1) {
				return n;
			}
			else {
				return fibonacci(n-1) + fibonacci(n-2);
			}
			
		
	}

}
