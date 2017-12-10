package com.sample.codes;



public class MyArrayList {
	
	int capacity =5;
	int size=0;
	private static Object [] array;
	
	
	private int increaseLimit(int oldCapacity){
		capacity=(oldCapacity*3/2)+1;
		return capacity;
		
	}
	public int size(){
		return size;
		
	}
	private int getCapacity(){
		return capacity;
	}
	
	public MyArrayList(){
		MyArrayList.array=new Object[capacity];
	}
	
	
	
	public void add(Object e){
		
		if (size < capacity) {
			array[size] = e;
		} else {
			Object [] oldArray=MyArrayList.array;
			MyArrayList.array = new Object[increaseLimit(capacity)];
			for(int i=0;i<oldArray.length;i++){
				MyArrayList.array[i]=oldArray[0];
			}
			
			MyArrayList.array[oldArray.length]=e;
			 

		}
		size += 1;
	}
	
	public Object get(int index){
		if(index<size){
		return MyArrayList.array[index];
		}else{
			 throw new ArrayIndexOutOfBoundsException();
		}
		
	}
	
	public void remove(int index){
		if(index<size){
		 size=size-1;
		 for(int i=index; i < size;i++){
			 MyArrayList.array[i]=MyArrayList.array[i+1];
			 MyArrayList.array[i+1]=null;
		 }
		}else{
			 throw new ArrayIndexOutOfBoundsException();
		}
		
	}
	
	public static void main(String[] args) {
	
		MyArrayList list=new MyArrayList();
		System.out.println("Initial list capacity :-"+ list.getCapacity());

		list.add("abc");
		list.add("def");
		list.add("abc");
		list.add("def");
		
		System.out.println("*********after adding element to list*******");
		for (Object object : array) {
			System.out.println(object);
		}
		
		System.out.println("Change in list capacity :-"+ list.getCapacity());
		System.out.println("Size of list:-"+list.size());
		list.remove(0);
		System.out.println("*********after remove element from list*******");
		
		for (Object object : array) {
			System.out.println(object);
		}
		System.out.println("Size after removing element :-"+list.size());
		
		
		
		
		
		
	}

}
