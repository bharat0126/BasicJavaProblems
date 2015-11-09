package com.comprable.comparator.workout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {

	
	public static void main(String[] args) {
		List<ComparableSample> val=new ArrayList<ComparableSample>();
		
		ComparableSample sam1=new ComparableSample(23, "val1");
		ComparableSample sam2=new ComparableSample(89, "val2");
		ComparableSample sam3=new ComparableSample(56, "val3");
		ComparableSample sam4=new ComparableSample(35, "val4");
		ComparableSample sam5=new ComparableSample(36, "val5");
	
		val.add(sam1);
		val.add(sam2);
		val.add(sam3);
		val.add(sam4);
		val.add(sam5);
		
		
		System.out.println("******Befor sorting**********");
		for (ComparableSample sample : val) {
			
			System.out.println("id :-"+sample.getId() +"val :-"+sample.getVal());
		}
	
		Collections.sort(val);
		
		System.out.println("******Befor sorting**********");
		for (ComparableSample sample : val) {
			
			System.out.println("id :-"+sample.getId() +"val :-"+sample.getVal());
		}
		
	
	
	
	}
	

}
