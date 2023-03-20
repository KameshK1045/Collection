package kamesh4;
import java.util.*;


public class Assignment24 {
      
	public static void main(String[] args) {
		
		Stack <Integer>obj = new Stack<Integer>();
		obj.push(10);
		obj.push(45);
		obj.push(33);
		
		obj.pushArray();
		obj.pop();
		obj.pushArray();
		obj.get(1);
		//obj.getPush();
		
		
		
	}
}

class Stack<k>{
	
	k [] stack; //It is a object array any elements can push this array(int,string,boolean);
	int lengthofStack;
	
	public 
	Stack(){
		
		stack = (k[])new Object[0];
		lengthofStack=0;
	}
	
	//this method is used to push the elements into stack.
	
	void push(k elements) {
		
		stack = Arrays.copyOf(stack, lengthofStack+1);
		stack[stack.length-1] = elements;
		this.lengthofStack = stack.length;
		
	}
	
	
	//This method print last element of the the stack.
	
      void pop() {
    	  
    	System.out.println(stack[lengthofStack-1]);
    	stack = Arrays.copyOfRange(stack, 0,stack.length-1); 			
	}
      
      
	void pushArray() {
		System.out.println(Arrays.toString(stack));
	}
	
	
	void get(int elements) {
		System.out.println(stack[elements]);
	}
}

