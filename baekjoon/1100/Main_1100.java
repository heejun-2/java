import java.util.*;

public class Main_1100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char[][] arr = new char[8][8];
		int count = 0;
		
		for(int i = 0; i < 8; i++) {
			String s = sc.next();
			
			for(int j = 0; j < 8; j++) {
				arr[i][j] = s.charAt(j);
				
				if((i+j) % 2 == 0 && arr[i][j] == 'F') {
					count++;
				}
				
			}
			
		}
		System.out.println(count);
		
	}

}
