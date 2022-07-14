package coding;

import java.util.*;

public class Solution29 {
    public int[] solution(int []arr) {
        
        ArrayList<Integer> a = new ArrayList<>();
        
        int num = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != num){
                a.add(arr[i]);
                num = arr[i];
            }
            
        }
        
        int[] answer = new int[a.size()];
        
        for(int i = 0; i < a.size(); i++){
            answer[i] = a.get(i);
        }

        return answer;
        
    }
}
