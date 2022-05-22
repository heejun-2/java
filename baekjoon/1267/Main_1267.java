import java.util.*;

public class Main_1267 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int Y_sum = 0;
        int M_sum = 0;
        for(int i = 0; i < N; i++){
            int time = sc.nextInt();
            Y_sum += (time/30 + 1) * 10;
            M_sum += (time/60 + 1) * 15;          
        }
        
        if(Y_sum > M_sum){
            System.out.print("M"+" "+M_sum);
        }
        else if(Y_sum < M_sum){
            System.out.print("Y"+" "+Y_sum);
        }
        else if(Y_sum == M_sum){
            System.out.print("Y"+" "+"M"+" "+Y_sum);
        }
	}

}
