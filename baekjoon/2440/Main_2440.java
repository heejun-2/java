import java.util.*;

public class Main_2440 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        
	        int N = sc.nextInt();
	        
	        for(int i = 0; i < N; i++){
	            for(int j = i+1; j <= N; j++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}

}
