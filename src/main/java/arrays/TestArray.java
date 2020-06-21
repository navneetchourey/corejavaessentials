package arrays;

import java.util.Arrays;

public class TestArray {
public static void main(String[] args) {
	int [] array = {1,2,3};
	int [] temp =array;
	array= new  int[4];
//	System.arraycopy(src, srcPos, dest, destPos, length);
	System.arraycopy(temp, 0, array, 0, temp.length);
	temp=null;
	
	Arrays.stream(array).forEach(e->System.out.println(e+" "));
//	System.out.println("array : "+array.toString());
	
	
	
	
	//Test Polymorphic Array
	PolymorphicEmployee e = new PolymorphicManager();
	e= new PolymorphicSecretary();
	PolymorphicEmployee[] staff =  new PolymorphicEmployee[3];
	staff[0] = new PolymorphicEmployee();
	staff[0].name="James";
	staff[1] = new PolymorphicSecretary();
	staff[1].name="MoneyPenny";
	staff[2] = new PolymorphicSecretary();
	staff[2].name="Miles";
//	Arrays.sort(staff);
	Arrays.stream(staff).forEach(eObj->System.out.print(eObj+" "));
	
	String [] strArray = {"a","b","c","d","e","f","g","h","i","j"};
	int index=	Arrays.binarySearch(strArray, "f");
	
//	int index=Arrays.binarySearch(staff, "James");
	System.out.println("Index : "+index);
}
}
