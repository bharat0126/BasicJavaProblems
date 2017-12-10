package com.sample.codes;

public class MovieShow {
	
	
	static int[] start;
	static int[] end;
	
	
	

	public static void main(String[] args) {
		
		start =new int[]{8,10,12,15,18,21};
		end=   new int[]{10,12,18,16,20,24};
		
		int showCount=getShowCount(start,end);
		System.out.println(showCount);
	}

   private static int getShowCount(int[] start, int[] end) {
		
		int showCount=0;
		int showEnd=0;
		for (int i = 0; i < start.length; i++) {
			
			if(((i!=start.length-1) &&(end[i]==start[i+1])) ||showEnd==start[i] ){
				showCount+=1;
				showEnd=end[i];
			}
			
		}
		return showCount;
	}

}
