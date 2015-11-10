package com.sample.codes;

public class StringPalindrome  {

	
	public static boolean isStringPalindrome(String text){
		boolean isPalindrome=true;
		for (int start=0,end=(text.length()-1); start<end; start++,end--) {
			
			if(text.charAt(start)==text.charAt(end)){
				continue;	
			}else{
				isPalindrome=false;
				break;
			}
			
		}
		
		return isPalindrome;
		
	}

	
	public static void main(String[] args) {
		System.out.println(isStringPalindrome("aabbaa"));
	}

}
