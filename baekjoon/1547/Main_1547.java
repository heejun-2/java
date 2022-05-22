import java.util.*;

public class Main_1547 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        
	        int M = sc.nextInt();
	        int cup = 1;
	        
	        for(int i = 1; i <= M; i++){
	            int X = sc.nextInt();
	            int Y = sc.nextInt();
	            
	            if(X == cup){
	                cup = Y;
	            }
	            else if(Y == cup){
	                cup = X;
	            }
	            
	        }
	        System.out.print(cup);
	}

}
