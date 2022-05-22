import java.util.*;

public class Main_1297 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
        int D = sc.nextInt();
        int H = sc.nextInt();
        int W = sc.nextInt();
        
        double A = Math.sqrt(Math.pow(H,2)+Math.pow(W,2));
        
        int height = (int)Math.floor(H * (D / A));
        int width = (int)Math.floor(W * (D / A));
        
        System.out.print(height+" "+width);
	}

}
