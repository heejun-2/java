import java.util.*;

public class Main_10707 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int P = sc.nextInt();
        
        int X = P * A;
        int Y = 0;
        
        if(P<=C){
            Y = B;
        }
        else{
            Y = B + (P-C) * D;
        }
        System.out.print(Math.min(X,Y));
	}

}
