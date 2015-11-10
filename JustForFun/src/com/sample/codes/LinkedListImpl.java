package com.sample.codes;

import java.util.LinkedList;
import java.util.List;


public class LinkedListImpl {
	 
    public static void main(String[] args) {
        MyLinkedList lList = new MyLinkedList();
 
        lList.add("1");
        lList.add("2");
        lList.add("3");
        lList.add("4");
        lList.add("5");
        
        lList.add("8", 2);
 
        System.out.println("lList - print linkedlist: " + lList);
        /*System.out.println("lList.size() - print linkedlist size: " + lList.size());
        System.out.println("lList.get(3) - get 3rd element: " + lList.get(3));
        System.out.println("lList.remove(2) - remove 2nd element: " + lList.remove(2));
        System.out.println("lList.get(3) - get 3rd element: " + lList.get(3));
        System.out.println("lList.size() - print linkedlist size: " + lList.size());
        System.out.println("lList - print linkedlist: " + lList);*/
    	
    	
    	/*List<String> lList=new LinkedList<String>();
    	
    	 lList.add("1");
         lList.add("2");
         lList.add("3");
         lList.add("4");
         lList.add("5");
         
         lList.add(2,"8");
         System.out.println("lList - print linkedlist: " + lList);*/
         
    	
    }
}
 
class MyLinkedList {
    
    private Node head;
    private int listCount;
 
    
    public MyLinkedList() {
        head = new Node(null);
        listCount = 0;
    }
 
    public void add(Object data)
    
    {
        Node crunchifyTemp = new Node(data);
        Node node = head;
    
        while (node.getNext() != null) {
            node = node.getNext();
        }
    
        node.setNext(crunchifyTemp);
        listCount++;
    }
 
    public void add(Object data, int index)
    
    {
        Node crunchifyTemp = new Node(data);
        Node node = head;
        node.getData();
        for (int i = 0; i < index && node.getNext() != null; i++) {
            node = node.getNext();
            node.getData();
        }
        crunchifyTemp.setNext(node.getNext());
        node.setNext(crunchifyTemp);
        listCount++;
    }
 
    public Object get(int index)
    
    {
    
        if (index <= 0)
            return null;
 
        Node node = head.getNext();
        for (int i = 1; i < index; i++) {
            if (node.getNext() == null)
                return null;
 
            node = node.getNext();
        }
        return node.getData();
    }
 
    public boolean remove(int index)
    
    {
    
        if (index < 1 || index > size())
            return false;
 
        Node node = head;
        for (int i = 1; i < index; i++) {
            if (node.getNext() == null)
                return false;
 
            node = node.getNext();
        }
        node.setNext(node.getNext().getNext());
        listCount--; 
        return true;
    }
 
    public int size()
   
    {
        return listCount;
    }
 
    public String toString() {
        Node node = head.getNext();
        String output = "";
        while (node != null) {
            output += "[" + node.getData().toString() + "]";
            node = node.getNext();
        }
        return output;
    }
 
  private class Node {
        Node next;
        Object data;
 
        public Node(Object dataValue) {
            next = null;
            data = dataValue;
        }
 
       /* public Node(Object dataValue, Node nextValue) {
            next = nextValue;
            data = dataValue;
        }*/
 
        public Object getData() {
            return data;
        }
 
        /*public void setData(Object dataValue) {
            data = dataValue;
        }*/
 
        public Node getNext() {
            return next;
        }
 
        public void setNext(Node nextValue) {
            next = nextValue;
        }
    }
}