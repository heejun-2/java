package programmer;

public class Solution_1 {
    public int solution(int[] numbers) {
        int answer = 45;
        
        for(int i : numbers){
            answer -= i;
        }
        
        return answer;
    }
}
