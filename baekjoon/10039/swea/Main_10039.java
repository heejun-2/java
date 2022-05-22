package swea;
import java.util.*;

public class Main_10039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        
		 int sum = 0;
		 
	        for(int tc = 1; tc <= 5; tc++){
	            
	            int tmp = sc.nextInt();
	            if(tmp<40){
	                sum += 40;
	            }
	            else{
	                sum += tmp;
	            }
	        }
	        System.out.print(sum/5);

	}

}
