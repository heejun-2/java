import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		
		int b = Integer.parseInt(a, 16);
		System.out.println(b);
	}
}