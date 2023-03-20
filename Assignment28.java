package kamesh7;

import java.util.Arrays;

public class Assignment28 {
	
	public static void main (String[] args) {
		
		Queue <Integer> obj = new Queue<Integer>();
		obj.enQueue(10);
		obj.enQueue(45);
		obj.enQueue(33);
		obj.enQueue(93);
		obj.enQueue(55);
		obj.callQueue();
		obj.getQueue(4);
		obj.deQueue();
		obj.callQueue();
		
	}
        
}


class Queue<K>{
	
	private K []myQueue;
	private int lengthofmyQueue;
	
	public Queue() {
		myQueue = (K[])new Object[0];
		this.lengthofmyQueue=0;
	}
	
	public void enQueue(K prop) {
		
		myQueue = Arrays.copyOf(myQueue, lengthofmyQueue+1);
		myQueue[lengthofmyQueue] = prop;
		lengthofmyQueue = lengthofmyQueue+1;
		
	}
	
	public void callQueue() {
		
		System.out.println(Arrays.toString(myQueue));
	}
	
	
	public void deQueue() {
		
		int firstQueue;
		if(myQueue.length>0) {
		System.out.println(myQueue[0]);
		}
		else {
			firstQueue = -1;
			System.out.println(firstQueue);
		}
    	myQueue = Arrays.copyOfRange(myQueue, 1,myQueue.length);
	}
	
	public void getQueue(int index) {
		System.out.println(myQueue[index]);
	}
}