package com.sample.codes;

public class ArrayNumSumExceptSelf {
	
	public static int[]  getArraySelfSum(int[] array){
		int length =array.length;
		int[] output =new int[length];
		for(int i=0;i<length;i++){
	        int sum=0;		
			for(int j=0;j<length;j++){
				if(i!=j){
					sum+=array[j];
				}
			}
			output[i]=sum;
		}
		return output;
	}
	
	public static int[]  getArraySelfSumNaturalNo(int[] array){
		int n =array.length;
		int sum = (n * (n + 1)) / 2;
		int[] output =new int[n];
		for(int i=0;i<n;i++){
	        output[i]=sum-array[i];
		}
		return output;
	}
	
	
	
	
	public static void main(String[] args) {
		int [] array=new int[]{1,2,3,4};
		for (int i : getArraySelfSumNaturalNo(array)) {
			System.out.println(i);
		}
		
	}

}
