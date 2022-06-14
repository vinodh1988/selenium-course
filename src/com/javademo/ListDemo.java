package com.javademo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
	list.add("Ram");
	list.add("Rajeev");
	list.add("Ram");
	list.add("Rahul");
	list.add(null);
	list.add(2,"Naveen");
	
	System.out.println(list);
	
	for(String x:list)
		System.out.println(x);

  }
  /*
   * List is an interface
   * It is  available in java.util package
   * 
   * Major implementations of List are 
   *   ArrayList - it internally array to create a list
   *   LinkedList - it used double linked list
   *   
   *  List is a linear collection of elements
   *  you can add/retrieve elements randomly
   *  
   *  It can have duplicates 
   *  elements are basically indexed
   */
} 
