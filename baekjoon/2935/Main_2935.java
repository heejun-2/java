import java.util.*;
import java.math.*;

public class Main_2935 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		  BigInteger n = new BigInteger(sc.nextLine());
	      char c = sc.nextLine().charAt(0);
	      BigInteger m = new BigInteger(sc.nextLine());
		
		if(c=='*') {
			System.out.println(n.multiply(m));
		}
		else {
			System.out.println(n.add(m));
		}
	}

}
