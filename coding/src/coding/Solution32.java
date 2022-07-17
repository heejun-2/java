package coding;

class Solution32 {
    public long solution(int price, int money, int count) {
        long sum = 0;
        long result = 0;
        
        for(int i = 1; i <= count; i++){
            sum += price * i;
        }
        
        if(money >= sum){
            return 0;
        }
        else{
            result = sum - money;
            return result;
        }
    }
}