package coding;

class Solution25 {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        
        char[] c = s.toCharArray();
        
        for(int i = 0; i < c.length; i++){
            if(c[i] == 'p' || c[i] == 'P'){
                p++;
            }
            if(c[i] == 'y' || c[i] == 'Y'){
                y++;
            }
        }
        
        if(p == y){
            return true;
        }
        else{
            return false;
        }
        
        


    }
}