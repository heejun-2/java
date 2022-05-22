package swea;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		// 1 ~ 12월 일 수를 담을 배열
		int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int i=1; i<=T; i++) {
			
			// 월, 일 입력
			int month1 = scan.nextInt();
			int day1   = scan.nextInt();
			int month2 = scan.nextInt();
			int day2   = scan.nextInt();
			
			int diff = day2 - day1 + 1;
			for(int j=month1; j<month2; j++) {
				diff += days[j-1];
			}
			System.out.print("#" + i + " " + diff);
			System.out.println();
		} 
		
		
		scan.close();
	}

}
