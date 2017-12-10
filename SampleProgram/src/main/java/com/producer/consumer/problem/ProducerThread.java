package com.producer.consumer.problem;

import java.util.List;

public class ProducerThread implements Runnable{

    private List<String> bucket;
    private Integer limit;
    
    ProducerThread(List<String> bucket,Integer limit){
	this.bucket=bucket;
	this.limit=limit;
    }

    public void run() {
	while(true){
	    produce();
	}
    }
    
    public void produce(){
	synchronized (bucket) {
	    if (bucket.size() < limit) {
		 System.out.println("Producting product.........." +Thread.currentThread().getName());
		bucket.add("Product");
		bucket.notify();
	    } else {
		try {
		    System.out.println("Stop Producting product bucket is full .........." +Thread.currentThread().getName());
		    bucket.wait();
		} catch (InterruptedException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	    }
	}
      
    }

}