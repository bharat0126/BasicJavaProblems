package com.comprable.comparator.workout;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestJava {
	
	public static void main(String[] args) {
		
		List<String> arrList=new ArrayList<String>();
		arrList.add("abc1");
		arrList.add("abc2");
		arrList.add("abc3");
		arrList.add("abc4");
		
		//Iterator lt=arrList.iterator();
		System.out.println("************"+arrList.size());
		for (ListIterator iterator = arrList.listIterator(); iterator.hasNext();) {
		System.out.println(iterator.next());
		 iterator.set("ab");
			
			
		}
		
		
		System.out.println("*********"+arrList.size());
	}

}
