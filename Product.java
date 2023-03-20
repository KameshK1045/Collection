package supermarket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Product {
      
	int productId;
	String productName;
    String catogary;
	int price;
	String quantity;
	
	 Product(int product,String name,String cate,int prices,String size){
		productId=product;
		productName=name;
		catogary=cate;
		price=prices;
		quantity=size;
	}

	public static void main(String[] args) {
		
	
	List<Product> products = new ArrayList<Product>();
	
	Product product1 = new Product(1001,"Milk","Dairy",25,"1/2Litre");
	Product product2 = new Product(1002,"Spinach","Vegetables",20,"1Bunch");
	Product product3 = new Product(1003,"Cereals","Groceries",120,"1Kg");
	Product product4 = new Product(1004,"Paneer","Dairy",40,"200gm");
	Product product5 = new Product(1005,"Rice","Groceries",50,"1Kg");
	Product product6 = new Product(1006,"Onions","Vegetables",30,"1Kg");
	
	
	products.add(product1);
	products.add(product2);
	products.add(product3);
	products.add(product4);
	products.add(product5);
	products.add(product6);
	
	Collections.sort(products,new comparable());
	
	Iterator <Product> itr = products.iterator();
	while(itr.hasNext()) {
		Product obj = itr.next();
		System.out.println(obj);
	}
	System.out.println();
	ArrayList <Product> dairy = new ArrayList<Product>();
	for(int i=0; i<products.size(); i++) {
		if(products.get(i).catogary.equals("Dairy")) {
			dairy.add(products.get(i));
		}
	}
	

	ArrayList <Product> vegetables = new ArrayList<Product>();
	for(Product P:products) {
		if(P.catogary.equals("Vegetables")) {
		vegetables.add(P);
		}
	}
	

	
	ArrayList <Product> grocery = new ArrayList<Product>();
	for(Product P:products) {
		if(P.catogary.equals("Groceries")) {
		grocery.add(P);
		}
	}
	
	
	Map<String,ArrayList<Product>> map = new HashMap<String,ArrayList<Product>>();
	
	map.put("Dairy", dairy);
	map.put("Vegetables", vegetables);
	map.put("Groceries", grocery);
	
	Set<Entry<String,ArrayList<Product>>> set = map.entrySet();
	
	Iterator<Entry<String,ArrayList<Product>>> itr2 = set.iterator();
	
	while(itr2.hasNext()) {
		
		Entry<String,ArrayList<Product>> obj = itr2.next();
		System.out.println(obj.getKey()+" : "+obj.getValue());
	}
	
	System.out.println();
	System.out.println("Welcome to my shop"+"\n"+"What do you want ?"+"\n"+"Products"+"\n"+"1001 : Milk    : 25rs"+"\n"+"1002 : Spinach : 20rs"+"\n"+"1003 : Cereals : 120rs"+"\n"+"1004 : Paneer  : 40rs"+"\n"+"1005 : Rice    : 50rs"+"\n"+"1006 : Onions  : 30rs"+"\n"+"Click the product id to buy"+"\n"+"Press other to exit");
	int option;
	boolean one =true;
	double total = 0.0;
	Cart rate = new Cart();
    try {
	while(!false) {
	Scanner customer = new Scanner(System.in);
	option = customer.nextInt();
	
	switch(option) {
	case 1001: total += product1.price;
	rate.pro.add(product1);
	break;
	case 1002: total+=product2.price;
	rate.pro.add(product2);
	break;
	case 1003: total += product3.price;
	rate.pro.add(product3);
	break;
	case 1004: total+=product4.price;
	rate.pro.add(product4);
	break;
	case 1005: total += product5.price;
	rate.pro.add(product5);
	break;
	case 1006: total+=product6.price;
	rate.pro.add(product6);
	break;
	default : if(option<1001||option>1006){
	if((total<500)){
		rate.setTotalAmount(total);
		System.out.println(rate.pro);
		System.out.println("Thanks for purchasing..."+"\nTotal amount : "+rate.getTotalAmount()+"\nVisit again...");
		one=false;
		break;
	}
	
	else if(total>=1000) {
		rate.setDiscountRate(15);
		rate.setTotalAmount(total);
		rate.discount();
		System.out.println(rate.pro);
		System.out.println("Thanks for purchasing..."+"\nTotal amount : "+rate.getTotalAmount()+"\n"+"You got on 15% discount"+"\n"+"Your amount : "+rate.getAmountAfterDiscount()+"\nVisit again...");
		break;
		
	}
   else if(total >=500 && total <1000) {
	rate.setDiscountRate(10);
	rate.setTotalAmount(total);
	rate.discount();
	System.out.println(rate.pro);
	System.out.println("Thanks for purchasing..."+"\nTotal amount : "+rate.getTotalAmount()+"\n"+"You got on 10% discount"+"\n"+"Your amount : "+rate.getAmountAfterDiscount()+"\nVisit again...");
	break;
	
}
	
	}
	}
	

	}
    }
    catch(Exception ex) {
    	System.out.println("Enter the valid details");
    }
	
	
	
}	
	
public String toString() {
		
		return "["+"Product Id: "+productId+" Product Name: "+productName+" Catogary: "+catogary+" Price: "+price+" Quantity: "+quantity +"]"+"\n";
	}
	
}	

class comparable implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.price-o2.price;
	}
	
	
}


class Cart{

		double totalAmount;
		int discountRate;
		double amountAfterDiscount;
		List<Product> pro = new ArrayList<Product>();

public double getTotalAmount() {
	return totalAmount;
}
public void setTotalAmount(double totalAmount) {
	this.totalAmount = totalAmount;
}
public int getDiscountRate() {
	return discountRate;
}
public void setDiscountRate(int discountRate) {
	this.discountRate = discountRate;
}
public double getAmountAfterDiscount() {
	return amountAfterDiscount;
}
public void setAmountAfterDiscount(double amountAfterDiscount) {
	this.amountAfterDiscount = amountAfterDiscount;
}

    void discount() {
    	amountAfterDiscount = ((discountRate/100.0) * totalAmount); 
    	setAmountAfterDiscount(totalAmount-amountAfterDiscount);
    }
      

}

