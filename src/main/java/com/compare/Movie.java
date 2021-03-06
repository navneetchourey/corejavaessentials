package com.compare;
//A comparable object is capable of comparing itself with another object. The class itself must implements the java.lang.Comparable interface to compare its instances.
//
//Consider a Movie class that has members like, rating, name, year. Suppose we wish to sort a list of Movies based on year of release. We can implement the Comparable interface with the Movie class, and we override the method compareTo() of Comparable interface.
//When we make a collection element comparable(by having it implement Comparable), we get only one chance to implement the compareTo() method. The solution is using Comparator.

public class Movie implements Comparable<Movie> {
	private double rating; 
    private String name; 
    private int year;
    // Used to sort movies by year 
    public int compareTo(Movie m) 
    { 
        return this.year - m.year; 
    } 
    // Constructor 
    public Movie(String nm, double rt, int yr) 
    { 
        this.name = nm; 
        this.rating = rt; 
        this.year = yr; 
    } 
  
    // Getter methods for accessing private data 
    public double getRating() { return rating; } 
    public String getName()   {  return name; } 
    public int getYear()      {  return year;  } 
}
