package swea;

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        

        C += D;
        
        
        while(C>59){
            if(C>59){
            C -= 60;
            B += 1;
        }
        if(B>59){
            B -= 60;
            A += 1;
        }
        if(A>23){
            A -= 24;
        }
        }
        
        System.out.println(A+" "+B+" "+C);
    }
}