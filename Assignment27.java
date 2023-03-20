package kamesh7;

import java.util.Calendar;

public class Assignment27 {

	public static void main(String[] args) {
		
		Integer a = 1234;
		Double b = 12.34;
		String c = "45";
		
		System.out.println(a.doubleValue());//It is return double value in Integer;
		
		System.out.println(a.floatValue());//It is return float value in Integer;
		
		System.out.println(b.intValue());// It is return int value in Double,Float;
		
		System.out.println(Integer.parseInt(c));// It is return Integer value in string;
		
		System.out.println(Integer.toBinaryString(a));//It is return a binary value in given Integer in string.
		
		System.out.println(a.toString());//It is return given Integer in string.
		
		System.out.println(a.valueOf(4));//also used Double,Float,Long,String;
		
		
		//Calendar class
		
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		cal.add(Calendar.DATE, 15);//Also add MONTH & YEAR;
		System.out.println(cal.getTime());
		
		
		Calendar next = Calendar.getInstance();
		next.set(Calendar.YEAR, 2020);//This method return the boolean value so we can check the date is after the currentDate.
		if(cal.after(next)) {
			System.out.println("Before date is : "+ cal.getTime());
		}
		if(next.before(cal)) {
			System.out.println("After date is : "+ next.getTime());//This method return the boolean value so we can check the date is before the currentDate.
		}
		
		
          
		System.out.println(cal.getTime());//This method(getTime) is used to return currentDate/MM/YYYY & Time.
		
		
		System.out.println(cal.getTimeZone().getDisplayName());//This method return the timezone if without getDisplayName else it IST.
		
		
		System.out.println(cal.getTimeInMillis());//This method return the milliseconds in today time since 12.00am;
		
		
		cal.roll(Calendar.YEAR,true);//This method works similarly to add method its the second parameter has true its rollup otherwise false its rolldown. It is also works on month,year,dayoftheweek,minuteand hour.
		System.out.println(cal.getTime());
		
		
		cal.set(Calendar.YEAR,2021);//This method is used to set the month,year,dayoftheweek we want;
		
		System.out.println(cal.get(Calendar.YEAR));//This method return the particular month,year and dayoftheweek we want;
			
		
	}

}
