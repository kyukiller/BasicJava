package org.totalbeginner.tutorial;

public class Person {
	//fields
	private String name;//name of person
	private int maximumBooks; //most books the person can check out
	
	//constructors
	public Person() {
		name = "unknown name";
		maximumBooks = 3;
	}
	
	//methods
	public String getName(){
		return name;
	}
	public void setName(String anyname) {
		name = anyname;
	}
	public int getMaximumBooks(){
		return maximumBooks;
	}
	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}
	
	public String toString(){		
		return this.getName() + " (" + this.getMaximumBooks() + " books)";
	}
}
