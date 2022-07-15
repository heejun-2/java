package coding;

import java.util.*;

class Solution30 {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        ArrayList<String> a = new ArrayList<>();
        
        for(int i = 0; i < strings.length; i++){
            a.add("" + strings[i].substring(n,n+1) + strings[i]);
        }
        
        Collections.sort(a);
        
        for(int i = 0; i < a.size(); i++){
            answer[i] = a.get(i).substring(1);
        }
        
        return answer;
        
    }
}