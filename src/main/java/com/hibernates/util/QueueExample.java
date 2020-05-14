package com.hibernates.util;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class QueueExample {

	
	public static void main(String[] args) {
		
		
		Queue<String> queue=new ArrayDeque<String>();
		queue.add("Hbo");
		queue.add("Star");
		queue.add("Hbdf");
		queue.add("Her");
		queue.add("Hrr");
		queue.add("Hweee");
		
		System.out.println(queue);
		
		Iterator iterator = queue.iterator(); 
      // while (iterator.hasNext())
        //	if(queue.size()>5)
           /* {
        		//pollLast(): Retrieves and removes the last element of this deque, or returns null if this deque is empty.
            });*/
		
	}
}
