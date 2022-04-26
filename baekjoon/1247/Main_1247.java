import java.util.*;
import java.math.*;

public class Main_1247 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        
	        int N = sc.nextInt();
	        int sum = 0;
	        
	        for(int tc = 1; tc <= N; tc++){
	            sum += sc.nextBigInteger();
	        }
	        if(sum == 0){
	            System.out.println("0");
	        }
	        if(sum > 0){
	            System.out.println("+");
	        }
	        if(sum < 0){
	            System.out.println("-");
	        }
	}

}
