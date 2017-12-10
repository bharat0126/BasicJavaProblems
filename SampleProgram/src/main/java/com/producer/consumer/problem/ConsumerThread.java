package com.producer.consumer.problem;

import java.util.List;

public class ConsumerThread implements Runnable{
    
    private List<String> bucket;
    private Integer limit;
    
    ConsumerThread(List<String> bucket,Integer limit){
	this.bucket=bucket;
	this.limit=limit;
    }

    public void run() {
	while(true){
	    consume();
	}
    }
    
    public void consume(){
	synchronized(bucket){
	  if(bucket.size()>0 && bucket.size()<=limit){
	      System.out.println("Consuming product.........." +Thread.currentThread().getName());
	      bucket.remove(0);
	      bucket.notify();
	  }else{
	      System.out.println("No product to consume ........" +Thread.currentThread().getName());
	      try {
		bucket.wait();
	    } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	  }
	}
      
    }

}
