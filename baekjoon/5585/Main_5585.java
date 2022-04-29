import java.util.*;

public class Main_5585 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int number = 0;
		int money = 1000 - T;
		
		while(true) {
			if(money == 0) {
				break;
			}
			
			if(money >= 500) {
				money -= 500;
				number++;
			}
			else if(money >= 100) {
				money -= 100;
				number++;
			}
			else if(money >= 50) {
				money -= 50;
				number++;				
			}
			else if(money >= 10) {
				money -= 10;
				number++;
			}
			else if(money >= 5) {
				money -= 5;
				number++;
			}
			else if(money >= 1) {
				money -= 1;
				number++;
			}
						
		}		
		
		System.out.println(number);
	}

}
