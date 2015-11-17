package com.sample.codes;

public class CheckSubString {

	public static boolean isSubString(String s1, String s2) {
		boolean isSubString = false;

		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (c == s2.charAt(0)) {
				for (int j = 1; j < s2.length(); j++) {
					if (s1.charAt(i + j) == s2.charAt(j)) {
						isSubString = true;
						continue;
					} else {
						isSubString = false;
						break;

					}

				}

			}

		}

		return isSubString;
	}
	
	public static void main(String[] args) {
	 String s1="1 Hello ";
	 String s2="Hell";
	 
	 System.out.println(isSubString(s1,s2));
	 
	}
	
	

}
