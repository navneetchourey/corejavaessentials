package staticarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MyDateComparator implements Comparator {

	public MyDateComparator(int i, int j, int k) {
		this.day=i;
		this.month=j;
		this.year=k;
	}
	public MyDateComparator() {
		// TODO Auto-generated constructor stub
	}
	private int day;
	 private int month;
	 private int year;
	 private static MyDateComparator[] holidays;
	 private static MyDateComparator[] holidays2;

	
	 
	 
	 @Override
	public String toString() {
		return "MyDateComparator [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	public static void main(String[] args) {
		 MyDateComparator comparator = new MyDateComparator(10, 10, 2010);
		 MyDateComparator comparator2 = new MyDateComparator(5, 11, 2005);
		 System.out.println("comparator :  "+comparator);
		 MyDateComparator comparatorObj = new MyDateComparator();
		int result= comparatorObj.compare(comparator, comparator2);
		System.out.println("result : "+result);
		
	}


	@Override
	public int compare(Object o,Object o2) {
		MyDateComparator d1 = (MyDateComparator) o;
		MyDateComparator d2 = (MyDateComparator) o2;
		System.out.println("d1 : "+d1);
		if(d1.year!=d2.year)
		{
			System.out.println("year : "+year);
			return d2.year-d1.year;
		}
		if(d1.month!=d2.month)
		{
			System.out.println("month : "+month);

			return d2.month-d1.month;

		}
		if(d1.day!=d2.day)
		{
			System.out.println("day : "+day);

			return d2.day-d1.day;

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