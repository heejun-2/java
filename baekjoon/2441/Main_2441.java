import java.util.*;

public class Main_2441 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        
	        int N = sc.nextInt();
	        
	        for(int i = 1; i <= N; i++){
	            for(int j = 1; j <= i-1; j++){
	                System.out.print(" ");
	            }
	            for(int k = 1; k <= N - i + 1; k++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}

}
