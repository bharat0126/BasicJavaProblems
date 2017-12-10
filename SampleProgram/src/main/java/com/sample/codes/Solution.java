package com.sample.codes;

import java.util.Scanner;


public class Solution {
    
    public static boolean isBalanced(String expression) {
        boolean flag=true;
        int size=expression.length();
        for(int i=0,j=size-1; i<size/2;i++,j--){
            System.out.println((int)expression.charAt(i));
            System.out.println((int)expression.charAt(j));
            
            if((int)expression.charAt(i)== (int)expression.charAt(j)+2){
                continue;
            }else{
                flag=false;
                break;
            }
        }
        return flag;
        
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
