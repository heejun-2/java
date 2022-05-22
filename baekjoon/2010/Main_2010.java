import java.util.*;

public class Main_2010 {
	 public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        
	        int N = sc.nextInt();
	        int[] arr = new int[N];
	        int result = 0;
	        
	        for(int i = 0; i < N; i++){
	            arr[i] = sc.nextInt();
	        }
	        Arrays.sort(arr);
	        
	        if(arr[N-1] == 1){
	            System.out.print(1);
	        }
	        if(arr[N-1]<1){
	            for(int i = 0; i < N-1; i++){
	                arr[i] -= 1;     
	                for(int j = 0; j < N; j++){
		                result += arr[j];
		            }
	            }
	            
	            System.out.print(result);
	        }
	    }
}
