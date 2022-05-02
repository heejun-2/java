import java.util.*;

public class Main_5597 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[31];
		
		for(int i = 1; i < 29; i++) {
			int T = sc.nextInt();
			arr[T] = 1;
		}
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] != 1) {
				System.out.println(i);
			}
		}
	}

}
