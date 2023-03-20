package kamesh6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Assignment26 {

	public static void main(String[] args) {
		 
		int array[]= {1,2,3,4};
		ExceptionHandling obj = new ExceptionHandling();
		obj.nullPoint(null);
//		obj.arithmetic(1);
//		obj.stackOverflow(1);
//		obj.arrayIndex(array,2);
//		obj.numberEx("kamesh");
//    	obj.parseEx();
		

//		classCast obj2 = (classCast)obj; //ClassCastException
		
	
		
//		Class.forName("compare"); // ClassNotfoundException
		
	}

}


class ExceptionHandling{
	      
	public void nullPoint(String b) {
		System.out.println(b.toLowerCase());//If we do any operation on null value its a nullpointer exception(Checked Exception);
	}
	
	public void arithmetic(int number) {
		System.out.println(number/0); // If any number divided by zero its infinity so its return arithmetic exception(Runtime Error);
	}
	
	public void stackOverflow(int numbers) {
		numbers++;
		System.out.println(numbers);
		//if(numbers<1000)
		stackOverflow(numbers);//More recursive function stack will get overflow called stackoverflow error.(RuntimeError);
	}
	
	public void arrayIndex(int []arr,int index) {
		  System.out.println(arr[index+arr.length]);// The array length is lower than the index position so its called arrayIndexOutOfBoundsException;
	}
	
	public void numberEx(String a) {
		System.out.println(Integer.parseInt(a));//String can't be convert to number so return NumberException
	}
	
	public void parseEx() {
		
		SimpleDateFormat d = new SimpleDateFormat("dd/MM/YYYY");
		Date date = d.parse("3/5/2002");
		
		
		
	}

	
}

class classCast extends ExceptionHandling{
	
	public void parseEx() {
		
	    System.out.println("hi");
	}
}

