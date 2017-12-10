package com.common.topics;

public class ImmutableClassDemo{

	public static void main(String[] args) {
		ImmutableClass obj = new ImmutableClass("ravi");
		ImmutableClass obj2 = new ImmutableClass("sharma");
		
		System.out.println(obj.getName());
		System.out.println(obj2.getName());
	}

}
