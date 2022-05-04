import java.util.*;

public class Main_4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		
		for(int i = 0; i < T; i++) {
			
			int N = sc.nextInt();
			
			double sum = 0;
			double count = 0;	
			double average = 0;

			int[] arr = new int[N];
			
			for(int j = 0; j < N; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			
			average = sum / N;
			
			for(int j = 0; j < N; j++) {
				if(average < arr[j]) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n",(count/N)*100);
			
		}
		
	}

}
