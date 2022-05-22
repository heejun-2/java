import java.util.*;

public class Main_10797 {
	 public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        
	        int day = sc.nextInt();
	        int[] arr = new int[5];
	        int count = 0;
	        
	        for(int i = 0; i < 5; i++){
	            arr[i] = sc.nextInt();
	            if(arr[i]==day){
	                count++;
	            }
	        }
	        System.out.print(count);
	        
	    }
}
