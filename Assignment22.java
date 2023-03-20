package kamesh2;

import java.util.Arrays;
import java.util.Comparator;



public class Assignment22{
	public static void main(String[] args) {
		Student obj=new Student("Kamesh",20,"25/11/2002","A");
		Student obj2=new Student("Veeravel",20,"10/04/2003","A");
		Student obj3=new Student("Nandha ganesh",20,"1/11/2002","A");
		Student obj4=new Student("Arun",20,"20/09/2003","B");
		Student obj5=new Student("Vengatesh",20,"12/12/2002","B");
		Student obj6=new Student("Giftson",18,"09/10/2004","B");
		Student obj7=new Student("Sadhu",17,"10/02/2005","C");
		Student obj8=new Student("Bala",17,"5/5/2004","C");
		Student obj9=new Student("Jasprit",32,"06/12/1990","C");
		Student obj10=new Student("Jaddu",32,"07/12/1990","D");
		
		
		Student[] students= {obj,obj2,obj3,obj4,obj5,obj6,obj7,obj8,obj9,obj10};
		Arrays.sort(students,new compare());
		for(int i=0; i<students.length; i++) {
			students[i].getDetails();
		}
		
		System.out.println();
		
	
	     Todo first = new Todo("10/12/2022","Eat","food","kamesh","uncomplete");
	     Todo second = new Todo("09/12/2022","Sleep","home","kamesh","soon");
	     Todo third = new Todo("08/12/2022","Code","office","kamesh","process");
	     Todo fourth = new Todo("07/12/2022","Study","online","kamesh","complete");
	     Todo fifth = new Todo("06/12/2022","Travel","bus","kamesh","soon");
	     
	     Todo[] todos= {first,second,third,fourth,fifth};
	     Arrays.sort(todos,new compares());
	     
	     
	     for(int i=0; i<todos.length; i++) {
	    	 todos[i].getTodo();
	     }
	     
	     System.out.println();
	     
	     
	     
	     FileInAFolder image = new FileInAFolder("images","06/12/2022","07/12/2022",10.5,"kamesh","home");
	     FileInAFolder music = new FileInAFolder("music","08/12/2022","09/12/2022",8.5,"kamesh","home");
	     FileInAFolder picture = new FileInAFolder("pictures","10/12/2022","11/12/2022",6.5,"kamesh","home");
	     FileInAFolder video = new FileInAFolder("video","12/12/2022","13/12/2022",100.2,"kamesh","home");
	     FileInAFolder document = new FileInAFolder("documents","14/12/2022","15/12/2022",10,"kamesh","home");
	     FileInAFolder downloads = new FileInAFolder("downloads","16/12/2022","17/12/2022",100.2,"kamesh","home");
	     FileInAFolder screenshot = new FileInAFolder("screenshot","18/12/2022","19/12/2022",10.2,"kamesh","picture");
	     FileInAFolder template = new FileInAFolder("template","20/12/2022","21/12/2022",10.8,"kamesh","home");
	     FileInAFolder snap = new FileInAFolder("snap","22/12/2022","23/12/2022",1.2,"kamesh","home");
	     FileInAFolder vscode = new FileInAFolder("vscode","24/12/2022","25/12/2022",6.2,"kamesh","home");
	     
	     FileInAFolder[] files= {image,music,picture,video,document,downloads,screenshot,template,snap,vscode};
	     Arrays.sort(files, new compared());
	     
	     for(int i=0; i<files.length; i++) {
	    	 files[i].getFile();
	     }
	     
	}
}





class Student {
	String name;
	int age;
	String Dob;
	String sec;
	
	Student(String name, int age, String Dob, String sec){
		this.name=name;
		this.age=age;
		this.Dob=Dob;
		this.sec=sec;
	}
	
	void getDetails() {
		System.out.println("Student Name : "+ this.name + " Age : "+this.age+" DOB : "+this.Dob+" Section : "+this.sec); 
	}
	
}

class compare implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}




class Todo{
	String Date;
	String Title;
	String Description;
	String Assign;
	String Status;
	
	
	Todo(String date ,String title, String description, String assign, String status){
		Date = date;
		Title = title;
		Description =description;
		Assign = assign;
		Status = status;
	}
	
	void getTodo() {
		System.out.println("Title : "+Title+" Description : "+Description+" Assigned To : "+Assign+" Date : "+Date+" Status : "+Status);	
		}
}


class compares implements Comparator<Todo>{

	@Override
	public int compare(Todo o1, Todo o2) {
		// TODO Auto-generated method stub
		return o1.Date.compareTo(o2.Date);
	}

}




class FileInAFolder{
	String Filename;
	String DateofCreate;
	String DateofModify;
	double Size;
	String Author; 
	String location;
	
	
	FileInAFolder(String file, String doc, String dom, double size,String author, String locate){
		
		Filename = file;
		DateofCreate = doc;
		DateofModify = dom;
		Size = size;
		Author = author;
		location = locate;
		
	}
	
	
	
	void getFile() {
		System.out.println("File name : "+Filename+" Date of creation : "+DateofCreate+" Date of Modified : "+DateofModify+" Size : "+Size+" Author : "+Author+" Location : "+location);
	}
	
}


class compared implements Comparator<FileInAFolder>{

	@Override
	public int compare(FileInAFolder o1, FileInAFolder o2) {
		// TODO Auto-generated method stub
		return o1.DateofModify.compareTo(o2.DateofModify);
	}

}