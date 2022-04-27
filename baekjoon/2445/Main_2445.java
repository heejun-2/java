import java.util.*;

public class Main_2445 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			for(int k = 0; k < 2*(N-i)-2; k++) {
				System.out.print(" ");
			}
			for(int L = 0; L < i+1; L++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0; i < N-1; i++) {
			for(int j = 0; j < N-i-1; j++) {
				System.out.print("*");
			}
			for(int k = 0; k < 2*(i+1); k++) {
				System.out.print(" ");
			}
			for(int L = 0; L < N-i-1; L++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
