package com.sample.codes;

public class Sorting {
	
	
	public static int[] bubbleSort(int[] data){
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length-1; j++) {
			  if(data[j]>data[j+1]){
					int temp=data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
					
				}
			}
	}
		
		return data;
	}
	
	public static int[] selectionSort(int[] data){
		
		for (int i = 0; i < data.length; i++) {
			int minimum = i;
			for (int j = i; j < data.length; j++) {
				if(data[minimum]>data[j]){
					minimum=j;
				}
				
			}
			int temp=data[i];
			data[i]=data[minimum];
			data[minimum]=temp;
		
		}
		
		return data;
	}
	public static void main(String[] args) {
		
		int[] val= new int[]{25,17,5,13,1};
		val =Sorting.selectionSort( val);
		
		for (int i = 0; i < val.length; i++) {
			System.out.print(val[i]+",");
			
		}
		
	}

}
