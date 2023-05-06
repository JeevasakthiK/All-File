package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Types {

	public static void main(String[] args) {
		List<Object> li = new ArrayList<>(); 
		li.add(10);
		li.add("Testing");
		li.add(6.4823);
		li.add(20);
		li.add(30);
		li.add(9.88);
		li.add('L');
		li.add(40);
		li.add(null);
		System.out.println("*** List Methods ***");
		System.out.println("List 1 : "+li);
		/*for (Object list : li) {
			System.out.println(list);	
		}
		// returns the number of elements
		int size = li.size();//size() value based
		System.out.println("List Size() : "+size);
		
		// returns the elements of specified position
		Object object = li.get(7);// index of
		System.out.println("List Get() : "+object);
		
		// set() replace the element at specified position
		li.set(6, "List");
		System.out.println("List Set() : "+li);
		
		// remove the elements at specified position and return the list
		li.remove(8);// index of
		System.out.println("List Remove() : "+li);
		
		// returns the index of the first occurrence specified element of list 
		int indexOf = li.indexOf(20);
		System.out.println("List indexof():"+indexOf);
		
		// return true if the list contains specified elements
		boolean contains = li.contains('L');
		System.out.println("List Contains(): "+contains);
		
		// remove all the elements from the list 
		li.clear();
		System.out.println("List Clear(): "+li );*/
		List<Object> li1 = new LinkedList<>();
		li1.add(40);
		li1.add(9.88);
		li1.add("Training");
		li1.add(null);
		System.out.println("List 2 : "+li1);
		//add the all elements in the list 1 and 2
		li1.addAll(li); 
		System.out.println("List addAll(): "+li1);
		
		/*// return common elements of list 1 and 2
		li.retainAll(li1);
		System.out.println("List RetainAll(): "+li);	*/
		
		// remove the common elements and return li1 remaining
		li1.removeAll(li);
		System.out.println("List RemoveAll():"+ li1);
		
		
	}

}











