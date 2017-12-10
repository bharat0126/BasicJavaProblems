package com.sample.codes;


public class RecursionReverseString {
	
	/* Most deeply nested call first...
	reverse("o") -> returns "o"
	reverse("lo") -> adds 'l', "returns "ol", 
	reverse("llo") -> adds 'l', "returns "oll", 
	reverse("ello") -> adds 'e', "returns "olle", 
	reverse("hello") -> adds 'h', "returns "olleh", */

	public static String reverse(String str) {
	    if ((null == str) || (str.length() <= 1)) {
	        return str;
	    }
	    return reverse(str.substring(1)) + str.charAt(0);
	}
	
	public static void main(String[] args) {
		System.out.println(reverse("Hello how are you"));
	}

}
