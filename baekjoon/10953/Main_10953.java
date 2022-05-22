import java.util.*;

public class Main_10953 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			String s = sc.next();
			StringTokenizer st = new StringTokenizer(s,",");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			System.out.println(a+b);			
		}
		
	}
}
