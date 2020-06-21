package com.journaldev.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

//stream() − Returns a sequential stream considering collection as its source.
//Stream represents a sequence of objects from a source
//Sequence of elements − A stream provides a set of elements of specific type in a sequential manner.
//Source − Stream takes Collections, Arrays, or I/O resources as input source.
//Aggregate operations − Stream supports aggregate operations like filter, map, limit, reduce, find, match, and so on.
//Pipelining intermediate  operations  and their function is to take input, process them, and return output to the target. 
//collect() method is a terminal operation which is normally present at the end of the pipelining operation to mark the end of the stream.

//Generating Streams
//stream() − Returns a sequential stream considering collection as its source.
//parallelStream() − Returns a parallel Stream considering collection as its source.
public class StreamExample {
	
	public static void main(String[] args) {
		
	
	List<String> sourceStringList = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//	sourceStringList.stream().filter(predicate)
	
	List<String> filtered = sourceStringList
							.stream().
							filter(string -> !string.isEmpty())
							.collect(Collectors.toList());
	
	System.out.println("filtered "+filtered);
	List filteredList= new ArrayList();
	for(int i =0 ; i<sourceStringList.size();i++)
	{
		String element =sourceStringList.get(i);
		System.out.println("ëlement is :"+element );
		
		if(!element.isEmpty())
		{
			filteredList.add(element);
		}
	}
	System.out.println("filteredList : "+filteredList);
//	source ->intermediate operations -> collect result
//	System.out.println("filtered : "+filtered);
	/*
	
//	forEach
	//limit
	Random random1 = new Random();
	for(int i =0 ; i<10 ; i++) {
		
//		System.out.println("---------- "+random1.nextInt());
	}
	int j=0;
	while (j<9) {
		System.out.println("---------- "+random1.nextInt());

		j++;
	}
	
*/	
	
	
	Random random = new Random();
	random.ints().limit(5).forEach(System.out::println);
	
	
//	map
	List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
	//get list of unique squares
//	IntStream.range(0, numbers.size()).fi
	AtomicInteger index= new AtomicInteger();
//	Arrays.stream(numbers).filter(n-> Str)
	List<Integer> squaresList = numbers.stream().map( i -> i+5).collect(Collectors.toList());
	System.out.println("squaresList   :  "+squaresList);
	
//	filter
	List<String>stringsList = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
	//get count of empty string
	int count = (int) stringsList.stream().filter(string -> string.isEmpty()).count();
	java.util.Collections.sort(stringsList);
	System.out.println("sorted list : "+stringsList);
	
	/*
	System.out.println("count : "+count);
	stringsList.sort(new Comparator<String>() {
		public int compare(String s1, String s2);
		return s1
		
	});
	*/
//	sorted
	Random randomSort = new Random();
	randomSort.ints().limit(10).sorted().forEach(System.out::println);

	
	
    numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

	IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
	
	System.out.println("Highest number in List : " + stats.getMax());
	System.out.println("Lowest number in List : " + stats.getMin());
	System.out.println("Sum of all numbers : " + stats.getSum());
	System.out.println("Average of all numbers : " + stats.getAverage());

	
	Arrays.stream(new int[] {7,2,3}).map(n->2*n).findFirst().ifPresent(System.out::println);
	
	}
}
