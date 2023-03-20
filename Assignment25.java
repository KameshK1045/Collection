package kamesh4;


import java.util.Arrays;
import java.util.List;

public class Assignment25{

	public static void main(String[] args) {
		
		//Arrays.aslist
		
		//It is an immutable array its return the array copied.
		 
	//   int number[]={1,2,3,4,5}  // doesn't working.
		 Integer number[] = new Integer[]{1,2,3,4,5};// Working
		 String name[]= {"kamesh","rohit","jasprit","hardik"};
		 
		 List <String>list = Arrays.asList(name);
		 List <Integer>list2 = Arrays.asList(number);
		 
		 System.out.println(list);
		 System.out.println(list2);
		 
		 
		 //Arrays.binarySearch
		 
		 int [] arr = {10,20,30,40,50};
		 int find = 20;
		 
		 System.out.println(Arrays.binarySearch(arr, find));
		 //This method is used to find the elements into the array if the array have the elements its return the position of elements. 
		 //It doesn't have the elements the element value is into the array element range  it return the position of range element negative or it return arraylength+1(negative).
		 
		 
		 //Arrays.fill
		 
		 int [] arr2 = {1,2,3,4,5};
		 Arrays.fill(arr2,1,4,45);//Arrays.fill(arrayName,start,end(excluded),fillElement);
	
		 System.out.println(Arrays.toString(arr2));
		 
		 //This method is used to fill the elements into the array . 
		 
		 
		 //Arrays.copyOf
		 
		 
		 int [] arr3 = {1,2,3,4,5};
		 int [] arr4 =Arrays.copyOf(arr3,6);//(original Array,length);
		 
		 arr4[5]=6;
		 
		 System.out.println(Arrays.toString(arr4));
		 
		 
		 //Arrays.copyOfRange
		 
		 
		 String [] arr5= {"kamesh","rohit","jasprit","hardik"};
		 String arr6 []= Arrays.copyOfRange(arr5, 0, 2);//Arrays.copyOfRange(array,start,end);
		 
		 System.out.println(Arrays.toString(arr6));
		 
		 
		 
		 //Arrays.deepEquals();
		 
		 Object[][] obj1 = {{1,"kamesh",true,null},{1,2}};
		 Object[][] obj2 = {{1,"kamesh",true,null},{1,2}};
		 
		 System.out.println(Arrays.equals(obj1,obj2));
		 System.out.println(Arrays.deepEquals(obj1, obj2));//It is used to check multidimensional arrays.
		 
		 
		 
		 
		 
		 
	}
}
