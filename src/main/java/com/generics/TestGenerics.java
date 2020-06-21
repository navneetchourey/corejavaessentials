package com.generics;

import java.util.ArrayList;
import java.util.List;
//Generics allows you to specify the intended data type to be stored in a reference, in this case into the collection
public class TestGenerics {

	public static void main(String[] args) {
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(Integer.valueOf(1));
		primes.add(Integer.valueOf(2));
		primes.add(Integer.valueOf(3));
		primes.add(Integer.valueOf(4));
		primes.add(Integer.valueOf(5));
		int x = primes.get(1).intValue();
		System.out.println("x is : "+x);
	}
}
