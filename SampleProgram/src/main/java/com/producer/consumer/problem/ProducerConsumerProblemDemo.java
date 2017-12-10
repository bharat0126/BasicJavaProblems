package com.producer.consumer.problem;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerProblemDemo {
    
   public static void main(String[] args) {
     List<String> bucket=new ArrayList<String>(); 
     Integer factoryLimit=5;
     
     Thread consumerThread=new Thread(new ConsumerThread(bucket,factoryLimit), "consumerThread");
     Thread producerThread=new Thread(new ProducerThread(bucket,factoryLimit), "producerThread");
     producerThread.start();
     consumerThread.start();
     
   }

}
