package ass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Arraylist {

	public static void main(String[] args) {
//	ArrayList <Integer> arrayList = new ArrayList<Integer>();
//	
//	for(int i=0; i<1000000; i++) {
//		arrayList.add(i);
//	}
//	long startTime = System.currentTimeMillis();
//	arrayList.add(20,45);
//	
////	for(int i=0; i<arrayList.size(); i++) {
////		System.out.println(arrayList.get(i));
////	}
//	long endTime = System.currentTimeMillis();
//	System.out.println("ArrayList elapsed Time: "+(endTime-startTime));
//	
//	
//	//-----------------------------------------------------------------------------------------------------------------
//	
//	LinkedList <Integer> linkedList = new LinkedList<Integer>();
//	
//	
//	for(int i=0; i<1000000; i++) {
//		linkedList.add(i);
//	}
//	long StartTime = System.currentTimeMillis();
//	linkedList.add(20,45);
//	
//	for(int i=0; i<linkedList.size(); i++) {
//		System.out.println(linkedList.get(i));
//	}
//	 long EndTime = System.currentTimeMillis();
//	 System.out.println("LinkedList elapsed Time: "+(EndTime-StartTime));
		
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			int i = itr.next();	
			System.out.println(i);
		}
		
		System.out.println();
		Set<Integer> set = new HashSet<Integer>();//Its not maintain the insertion order
		
		set.add(10);
		set.add(20);
		set.add(30);
		
		Iterator<Integer> itr1 = set.iterator();
		
		while(itr1.hasNext()) {
			int i = itr1.next();
			System.out.println(i);	
		}
		
		System.out.println();
		Map<String, Integer> info = new HashMap<String, Integer>();
		
		info.put("Kamesh", 323);
		info.put("Neveen", 305);
		info.put("Nandha", 317);
		info.put("Veera", 310);
		
		Set<String> sets = info.keySet();
		
		Iterator<String> itr2 = sets.iterator();
		
		while(itr2.hasNext()) {
			String key = itr2.next();
			System.out.println(key+" , "+info.get(key));
		}
		
		
		//Entry set iterator
	    System.out.println();
		Set<Entry<String,Integer>> entryset = info.entrySet();
		
		Iterator<Entry<String,Integer>> itr3 = entryset.iterator();
		
		while(itr3.hasNext()) {
			
			Entry<String,Integer> current = itr3.next();
			
			System.out.println(current.getKey()+" , "+current.getValue());
		}
}
}

