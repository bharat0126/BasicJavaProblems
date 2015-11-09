package com.comprable.comparator.workout;


public class ComparableSample implements Comparable {
	
	private int id;
	private String val;
	
	
	public ComparableSample(int id,String val){
		this.id=id;
		this.val=val;
		
	} 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}
	@Override
	public int compareTo(Object o) {
		
		ComparableSample val=(ComparableSample)o;
		
		if(this.id <val.getId())
			return -1;
		
		else if(this.id>val.getId())
			return 1;
		
		else if(this.id==val.getId())
			return 0;
		
		else return -1;
		
			
	}
	
	

}