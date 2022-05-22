import java.util.*;

public class Main_2443 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        
	        int N = sc.nextInt();
	        
	        for(int i = 0; i < N; i++){
	            for(int j = 0; j < i; j++){
	                System.out.print(" ");
	            }         
	                for(int k = 0; k < 2*(N-i)-1; k++){
	                    System.out.print("*");
	                }
	           
	            System.out.println();
	        }
	}

}
