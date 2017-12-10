package com.collections.examle;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String args[]) {

		TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
		TreeMap<String,Integer> hm2 = new TreeMap<String,Integer>();

		
		hm.put(102, "Ravi");
		hm.put(101, "Vijay");
		hm.put(103, "Rahul");
		hm.put(100, "Amit");
		
		hm2.put("Amit",100);
		hm2.put("Ravi" ,102);
		hm2.put("Vijay",101);
		hm2.put("Rahul",103);
		hm2.put("Bharat",103);

		for (Map.Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("****************************");
		for (Map.Entry<String,Integer> m : hm2.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
