package coding;

class Solution26 {
    public long solution(int a, int b) {
        long answer = 0;
        
        int x = 0;
        
        if(a > b){
            x = a;
            a = b;
            b = x;
        }
        
        for(int i = a; i <= b; i++){
            answer += i;
        }
        
        return answer;
    }
}