package com.common.topics;

import java.util.Scanner;

public class OverlodingConcept {
    
    public void m1(Exception e){
	System.out.println("Exception");
    }
    public void m1(ArithmeticException e){
	System.out.println("ArithmeticException");
    }
    public void m1(NullPointerException e){
	System.out.println("NullPointerException");
    }

    public static void main(String args[]){
	String s1="javatpoint";
	System.out.println(s1.indexOf("point"));//returns va
	//System.out.println(s1.substring(2));//returns vatpoint
	}
    }



