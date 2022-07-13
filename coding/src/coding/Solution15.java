package coding;

import java.util.*;

class Solution15 {
    public long solution(long n) {
        long answer = 0;
        
        //long형 변수 n을 String형 변수 number로 변경
        String number = Long.toString(n);
        
        //String형 배열 arr에 String형 변수number의 값을 한글자씩 넣기
        String[] arr = new String[number.length()];
        
        for(int i = 0; i < number.length(); i++){
            arr[i] = number.substring(i,i+1);
        }
        
        //내림차순 정렬
        Arrays.sort(arr, Collections.reverseOrder());
            
        String result = "";
        for(String i : arr){
            result += i;
        }
        
        return Long.parseLong(result);
    }
}