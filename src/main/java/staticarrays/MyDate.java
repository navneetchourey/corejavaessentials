package staticarrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MyDate implements Comparable {

	public MyDate(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}
	private byte day;
	 private byte month;
	 private short year;
	 private static MyDate[] holidays;
	 private static MyDate[] holidays2;

	 static {
		 
		 holidays= new MyDate[6];
		 holidays[0]= new MyDate(1,1,2016);
		 holidays[0]= new MyDate(1,1,2016);
		 holidays[0]= new MyDate(1,1,2016);
		 holidays[0]= new MyDate(1,1,2016);
		 holidays[0]= new MyDate(1,1,2016);
//		list
	 }
	 
	 
	 public static void main(String[] args) {
		System.out.println();
		
	}


	@Override
	public int compareTo(Object o) {
		MyDate d = (MyDate) o;
		if(year!=d.year)
		{
			return year-d.year;
		}
		if(month!=d.month)
		{
			return year-d.year;
		}
		if(day!=d.day)
		{
			return day-d.day;
		}
		return 0;
	}
}
	/* public void setDate(int m, int d, int y) {
		 if (valid(d, m, y)) {
		 day = (byte) d;
		 year = (short) y;
		 switch (month) {
		 case 4:
		 case 6:
		 case 9:
		 case 11:
		 return (day <= 30);
		 case 2:
		 return day <= 28 || (day == 29 && year % 4 == 0);
		 }
		 return true;
		 }
		 public boolean equals(Object o) {
		 if (o instanceof MyDate) {
		 MyDate d = (MyDate) o;
		 if ((d.day == day) && (d.month == month) && (d.year ==
		year)) {
		 return true;
		 }
		 }
		 return false;
		 }
		 public static MyDate[] getHolidays(){
		 return holidays;
		 }

		 public static void listHolidays() {
		 System.out.println("the holidays are:");
		 for (int x = 0; x < holidays.length; x++){
		 System.out.println(holidays[x]);
		 }
		 }
		}
}
*/