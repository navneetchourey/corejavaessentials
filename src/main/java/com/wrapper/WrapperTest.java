package com.wrapper;

public class WrapperTest {

	public static void main(String[] args) {
		Integer  wrapInt = Integer.valueOf(7);
		int j =wrapInt.intValue();
		Character wrapChar= Character.valueOf('a');
		char ch = wrapChar.charValue();
		System.out.println("wrapInt: "+wrapInt);
		System.out.println("ch: "+ch);

	}
	
}