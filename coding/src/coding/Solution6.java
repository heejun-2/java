package coding;

class Solution6 {
    public int solution(long num) {
        
        int answer = 0;
       
        while(true){
            
            if(num == 1){
                break;
            }
            
            if(num % 2 == 0){
                num /= 2;
                answer++;
             }
            
            else if(num % 2 == 1){
                num = num * 3 + 1;
                answer++;
            }
            
            if(answer == 500){
                return -1;
            } 
               
        }
        
        return answer;
        
    }
}
