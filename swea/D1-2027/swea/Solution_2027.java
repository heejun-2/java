package swea;

import java.util.*;

public class Solution_2027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 5; j++) {
				if(i==j) {
					System.out.print("#");
				}
				else {
					System.out.print("+");
				}			
			}
			
			System.out.println();
		}
	}

}
