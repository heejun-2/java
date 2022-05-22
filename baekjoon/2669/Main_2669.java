import java.util.*;

public class Main_2669 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[101][101];
		int count = 0;
		
		for(int i = 0; i < 4; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			for(int a = x1; a < x2; a++) {
				for(int b = y1; b < y2; b++) {
					arr[a][b] = 1;
				}
			}
		}
		
		for(int i = 0; i < 101; i++) {
			for(int j = 0; j < 101; j++) {
				if(arr[i][j] == 1) {
					count++;
				}
			}
		}
		System.out.println(count);
		
	}

}
