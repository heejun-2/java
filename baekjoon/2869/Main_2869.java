import java.util.*;

public class Main_2869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		
		int day = (V - A) / (A - B);
		
		if((V - A) % (A - B) == 0) {
			day += 1;
		}
		else {
			day +=2;
		}
		
		System.out.print(day);
		
	}

}
