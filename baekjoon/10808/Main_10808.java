import java.util.*;

public class Main_10808 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int[] arr = new int[26];
		
		for(int i = 0; i < s.length(); i++) {
			arr[s.charAt(i)-97]++;
		}
		for(int j = 0; j < 26; j++) {
			System.out.print(arr[j]+" ");
		}
		
	}

}
