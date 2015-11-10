package com.sample.codes;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByKey {
	
	
	public static void main(String[] args) {
		
		Map<String,String> unsortedMap=new HashMap<String,String>();
		
		
		unsortedMap.put("b", "bharat");
		unsortedMap.put("a", "chirag");	
		unsortedMap.put("r", "akanksha");
		unsortedMap.put("p", "money");
		unsortedMap.put("c", "jugal");
	
		
		System.out.println("Print unsorted map");
		
		printMap(unsortedMap);
		
		System.out.println("=========");
		Map<String,String> sortedMap=new TreeMap<String, String>(unsortedMap);
		
		System.out.println("Print sorted map");
		printMap(sortedMap);
		
		
	}
	
	
	public static void printMap(Map<String, String> map) {
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() 
                                      + " Value : " + entry.getValue());
		}
	}

}
