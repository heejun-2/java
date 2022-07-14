package coding;

class Solution21 {
    public int solution(int n) {
        
        int answer = 0;
        int flag = 1;
        
        for(int i = 2; i <= n; i++){
            flag = 1;
            
            if(i == 2){
                answer++;
                continue;
            }
            
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    flag = 0;
                    break;
                }
            }
            
            if(flag == 1){
                answer++;
            }
            
        }
        
        return answer;
        
    }
}